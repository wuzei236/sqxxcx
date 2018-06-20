package com.sqxxcx.customer.api.service;

import com.sqxxcx.customer.api.vo.DmpzzlReqVo;
import com.sqxxcx.customer.api.vo.DmpzzlResVo;
import com.sqxxcx.util.base.AvailableResult;

public interface IDmpzzlService {

	public AvailableResult<DmpzzlResVo> selectDmPzzl(DmpzzlReqVo req);
}
