package com.sqxxcx.util.base;


public class AvailableResult<T> extends BaseResult {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8410873434740253231L;
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "AvailableResult [data=" + data + "]";
	}

	public AvailableResult(T data) {
		this.data = data;
	}
	
	public AvailableResult() {};
}
