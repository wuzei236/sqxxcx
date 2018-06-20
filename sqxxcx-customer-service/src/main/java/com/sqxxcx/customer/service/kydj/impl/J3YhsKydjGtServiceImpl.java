package com.sqxxcx.customer.service.kydj.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqxxcx.customer.api.model.kydj.J3YhsKydjGtModel;
import com.sqxxcx.customer.api.service.kydj.IJ3YhsKydjGtService;
import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtReqVo;
import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtResVo;
import com.sqxxcx.customer.mapper.kydj.J3YhsKydjGtMapper;
import com.sqxxcx.util.base.AvailableResult;
import com.sqxxcx.util.enums.StatusService;

@Service
public class J3YhsKydjGtServiceImpl implements IJ3YhsKydjGtService{
	
	private Logger logger = LoggerFactory.getLogger(J3YhsKydjGtServiceImpl.class);
	
	@Autowired
	private J3YhsKydjGtMapper j3YhsKydjGtMapper;

	@Override
	public AvailableResult<J3YhsKydjGtResVo> selectYhsKydjGt(J3YhsKydjGtReqVo req) {
		// TODO Auto-generated method stub
		AvailableResult<J3YhsKydjGtResVo> availAbleResult = new AvailableResult<J3YhsKydjGtResVo>();
		J3YhsKydjGtResVo j3YhsKydjGtResVo = new J3YhsKydjGtResVo();
		List<J3YhsKydjGtModel> j3YhsKydjGtList = j3YhsKydjGtMapper.selectYhsKydjGt(req);
		j3YhsKydjGtResVo.setJ3YhsKydjGtModelList(j3YhsKydjGtList);
		availAbleResult.setData(j3YhsKydjGtResVo);
		availAbleResult.setReturnMessage("查询成功！返回"+j3YhsKydjGtList.size()+"条数据");
		availAbleResult.setStatusEnum(StatusService.SUCCESS);
		logger.info("查询成功！返回{}条数据",j3YhsKydjGtList.size());
		return availAbleResult;
	}

}
