package com.sqxxcx.util.enums;

public enum StatusService implements StatusEnum {
	
	SUCCESS(200,"处理成功"),FAIL(4404,"访问资源不存在"),PARAM_ERROR(4600,"请求参数异常"),SERVICE_ERROR(5210,"接口调用异常");
	
	private final int code;
	
	private final String message;

	@Override
	public Class<?> getStatusEnumType() {
		// TODO Auto-generated method stub
		return getClass();
	}

	@Override
	public int getStatusEnumCode() {
		// TODO Auto-generated method stub
		return this.code;
	}

	@Override
	public String getStatusName() {
		// TODO Auto-generated method stub
		return name();
	}

	@Override
	public String getStatusReason() {
		// TODO Auto-generated method stub
		return this.message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

	private StatusService(int code, String message) {
		this.code = code;
		this.message = message;
	}

	
}
