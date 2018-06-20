package com.sqxxcx.customer.api.vo.kydj;

import java.io.Serializable;
import java.util.List;

import com.sqxxcx.customer.api.model.kydj.J3YhsKydjGtModel;
import com.sqxxcx.util.base.BaseResVo;

public class J3YhsKydjGtResVo  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4516569981808318821L;
	private List<J3YhsKydjGtModel> j3YhsKydjGtModelList;

	public List<J3YhsKydjGtModel> getJ3YhsKydjGtModelList() {
		return j3YhsKydjGtModelList;
	}

	public void setJ3YhsKydjGtModelList(List<J3YhsKydjGtModel> j3YhsKydjGtModelList) {
		this.j3YhsKydjGtModelList = j3YhsKydjGtModelList;
	} 
	
	
}
