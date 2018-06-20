package com.sqxxcx.customer.api.vo;

import java.util.List;

import com.sqxxcx.customer.api.model.DmpzzlModel;
import com.sqxxcx.util.base.BaseResVo;

public class DmpzzlResVo extends BaseResVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8531639665214915386L;

	private List<DmpzzlModel> DmpzzlList;

	public List<DmpzzlModel> getDmpzzlList() {
		return DmpzzlList;
	}

	public void setDmpzzlList(List<DmpzzlModel> dmpzzlList) {
		DmpzzlList = dmpzzlList;
	}


}
