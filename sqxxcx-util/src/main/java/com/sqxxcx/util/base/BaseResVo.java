package com.sqxxcx.util.base;

import java.io.Serializable;

public class BaseResVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5019523867471430967L;

	private int returnCode;
	
	private int resultCode;
	
	private String returnMessage;
	
	private String resultMessage;

	public int getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	@Override
	public String toString() {
		return "BaseResVo [returnCode=" + returnCode + ", resultCode=" + resultCode + ", returnMessage=" + returnMessage
				+ ", resultMessage=" + resultMessage + "]";
	}

	public BaseResVo(int returnCode, int resultCode, String returnMessage, String resultMessage) {
		this.returnCode = returnCode;
		this.resultCode = resultCode;
		this.returnMessage = returnMessage;
		this.resultMessage = resultMessage;
	}

	public BaseResVo() {}
	
	
}
