package com.dbcon.base.util;

import org.apache.ibatis.session.RowBounds;

public class MysqlRowboundUtil {

	public static RowBounds getMysqlRowbound(Integer start, Integer limit) {
		Integer s1 = start-1 ;
		RowBounds rowBounds = new RowBounds((s1 < 0 ? 0 : s1) * limit, limit);
		return rowBounds;
	}
}
