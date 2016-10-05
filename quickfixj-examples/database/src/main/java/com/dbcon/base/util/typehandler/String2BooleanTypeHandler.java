
package com.dbcon.base.util.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * <pre>
 * 用于将数据库中的"Y"、"N"转换为java的boolean类型
 * </pre>
 * @author tid
 * @version 1.00.00
 * <pre>
 *    修改记录
 *    修改后版本:     
 *    修改人：  
 *    修改日期:     
 *    修改内容: 
 * </pre>
 */
public class String2BooleanTypeHandler implements TypeHandler<Object>{
	
	

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, int)
	 */
	@Override
	public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
		boolean flag;
		if(rs.getString(columnIndex).equals("Y")){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, java.lang.String)
	 */
	@Override
	public Object getResult(ResultSet arg0, String arg1) throws SQLException {
		boolean flag;
		if(arg0.getString(arg1).equals("Y")){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.CallableStatement, int)
	 */
	@Override
	public Object getResult(CallableStatement arg0, int arg1)
			throws SQLException {
		return arg0.getString(arg1);
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#setParameter(java.sql.PreparedStatement, int, java.lang.Object, org.apache.ibatis.type.JdbcType)
	 */
	@Override
	public void setParameter(PreparedStatement arg0, int arg1, Object arg2,
			JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
