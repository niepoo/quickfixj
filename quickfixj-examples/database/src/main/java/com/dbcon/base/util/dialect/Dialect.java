package com.dbcon.base.util.dialect;

public abstract class Dialect {

	public abstract String getPagedString(String query, int offset, int limit);

}