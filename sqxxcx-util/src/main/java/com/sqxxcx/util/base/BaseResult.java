package com.sqxxcx.util.base;

import java.io.Serializable;

import com.sqxxcx.util.enums.StatusEnum;


public class BaseResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7322947076714987481L;

	private StatusEnum statusEnum;
	
	private String returnMessage;

	public StatusEnum getStatusEnum() {
		return statusEnum;
	}

	public void setStatusEnum(StatusEnum statusEnum) {
		this.statusEnum = statusEnum;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	@Override
	public String toString() {
		return "BaseResult [statusEnum=" + statusEnum + ", returnMessage=" + returnMessage + "]";
	}

	public BaseResult(StatusEnum statusEnum, String returnMessage) {
		this.statusEnum = statusEnum;
		this.returnMessage = returnMessage;
	}

	public BaseResult() {}

	
	
}
