package com.sqxxcx.customer.mapper.kydj;

import java.util.List;

import com.sqxxcx.customer.api.model.kydj.J3YhsKydjGtModel;
import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtReqVo;

public interface J3YhsKydjGtMapper {

	public List<J3YhsKydjGtModel> selectYhsKydjGt(J3YhsKydjGtReqVo req);

}
