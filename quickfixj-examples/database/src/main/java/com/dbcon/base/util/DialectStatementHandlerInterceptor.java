
package com.dbcon.base.util;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.RowBounds;

import com.dbcon.base.util.dialect.Dialect;
import com.dbcon.base.util.dialect.MySQLDialect;
import com.dbcon.base.util.dialect.OracleDialect;

/**
 * 
 * <pre>
 * Interceptor实现类。
 * </pre>
 * @author tid
 * @version 1.00.00
 * 
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class DialectStatementHandlerInterceptor implements Interceptor {
	
	private static Map<String, Dialect> dialectMap = new HashMap<String, Dialect>();
	
	static {
		dialectMap.put("jdbc:oracle", new OracleDialect());
		dialectMap.put("jdbc:mysql", new MySQLDialect());
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.plugin.Interceptor#intercept(org.apache.ibatis.plugin.Invocation)
	 */
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		RoutingStatementHandler statement = (RoutingStatementHandler) invocation
				.getTarget();
		StatementHandler handler = (StatementHandler) ReflectUtil
				.getFieldValue(statement, "delegate");
		RowBounds rowBounds = (RowBounds) ReflectUtil.getFieldValue(handler,
				"rowBounds");
        
		if (rowBounds.getLimit() > 0
				&& rowBounds.getLimit() < RowBounds.NO_ROW_LIMIT) {
			BoundSql boundSql = statement.getBoundSql();
			String sql = boundSql.getSql();

			Dialect dialect = null;
			String dsInfo = invocation.getArgs()[0].toString();
			for (Entry<String, Dialect> entry : dialectMap.entrySet()) {
				if (dsInfo.startsWith(entry.getKey())) {
					dialect = entry.getValue();
					break;
				}
			}
			if (dialect == null) {
				dialect = new MySQLDialect();
			}
			
			sql = dialect.getPagedString(sql, rowBounds.getOffset(),
					rowBounds.getLimit());

			ReflectUtil.setFieldValue(boundSql, "sql", sql);
		}

		return invocation.proceed();
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.plugin.Interceptor#plugin(java.lang.Object)
	 */
	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.plugin.Interceptor#setProperties(java.util.Properties)
	 */
	@Override
	public void setProperties(Properties properties) {
	}
	
}