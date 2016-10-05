package com.dbcon.base.database.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * <pre>
 * 默认服务基类接口
 * </pre>
 * @author tid
 * @version 1.00.00
 * <pre>
 */
public interface IDefaultService {

	/**
	 * Spring受管Bean ID。
	 */
	public static final String BEAN_ID = "defaultService";

	/**
	 * 返回JDBC SimpleJdbcTemplate模板。
	 * 
	 * @return 返回JDBC SimpleJdbcTemplate模板
	 */
	public abstract JdbcTemplate getJdbcTemplate();

	/**
	 * 返回 sqlSessionTemplate。
	 * 
	 * @return 返回 sqlSessionTemplate。
	 */
	public abstract SqlSessionTemplate getSqlSessionTemplate();

	

}