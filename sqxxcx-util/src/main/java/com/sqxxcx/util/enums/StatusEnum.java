package com.sqxxcx.util.enums;

public abstract interface StatusEnum {

	public abstract Class<?> getStatusEnumType();
	
	public abstract int getStatusEnumCode();
	
	public abstract String getStatusName();
	
	public abstract String getStatusReason();
	
	public abstract String getMessage();
}
