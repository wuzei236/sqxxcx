package com.sqxxcx.customer.api.model;

import java.io.Serializable;

public class DmpzzlModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -415439265925373915L;

	private String pzzlDm;

	private String pzzlmc;

	public String getPzzlDm() {
		return pzzlDm;
	}

	public void setPzzlDm(String pzzlDm) {
		this.pzzlDm = pzzlDm;
	}

	public String getPzzlmc() {
		return pzzlmc;
	}

	public void setPzzlmc(String pzzlmc) {
		this.pzzlmc = pzzlmc;
	}

}
