package com.sqxxcx.customer.mapper;

import java.util.List;

import com.sqxxcx.customer.api.model.DmpzzlModel;
import com.sqxxcx.customer.api.vo.DmpzzlReqVo;

public interface DmpzzlMapper {

	//此方法名必须要和mybatis中对应的mapper.xml方法中的id保持一致，否则会无法对数据进行操作（包括增删改）
	public List<DmpzzlModel> selectDmPzzl(DmpzzlReqVo req);

}
