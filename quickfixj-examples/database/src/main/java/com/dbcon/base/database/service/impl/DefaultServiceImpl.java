
package com.dbcon.base.database.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dbcon.base.database.service.IDefaultService;

/**
 * 
 * <pre>
 * 访问数据库服务基类。
 * </pre>
 * 
 * @author tid
 * @version 1.00.00
 * 
 * </pre>
 */
public class DefaultServiceImpl implements IDefaultService {
	
	private SqlSessionTemplate sqlSessionTemplate;
	private JdbcTemplate jdbcTemplate;

	/**
	 * 返回 sqlSessionTemplate。
	 * 
	 * @return 返回 sqlSessionTemplate。
	 */
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	/**
	 * 返回 simpleJdbcTemplate。
	 * 
	 * @return 返回 simpleJdbcTemplate。
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param sqlSessionTemplate the sqlSessionTemplate to set
	 */
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	


}
