package com.sqxxcx.customer.api.service.kydj;

import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtReqVo;
import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtResVo;
import com.sqxxcx.util.base.AvailableResult;

public interface IJ3YhsKydjGtService {

	public AvailableResult<J3YhsKydjGtResVo> selectYhsKydjGt(J3YhsKydjGtReqVo req);

}
