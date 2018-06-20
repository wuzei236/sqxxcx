package com.sqxxcx.customer.service.kydj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sqxxcx.customer.api.service.kydj.IJ3YhsKydjGtService;
import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtReqVo;
import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtResVo;
import com.sqxxcx.util.base.AvailableResult;

@Component
public class J3YhsKydjGtService {
	
	@Autowired
	private IJ3YhsKydjGtService ij3YhsKydjGtService;

	public AvailableResult<J3YhsKydjGtResVo> selectYhsKydjGt(J3YhsKydjGtReqVo req) {
		// TODO Auto-generated method stub
		return ij3YhsKydjGtService.selectYhsKydjGt(req);
	}

}
