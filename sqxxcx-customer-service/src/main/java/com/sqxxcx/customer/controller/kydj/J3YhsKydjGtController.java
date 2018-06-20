package com.sqxxcx.customer.controller.kydj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtReqVo;
import com.sqxxcx.customer.api.vo.kydj.J3YhsKydjGtResVo;
import com.sqxxcx.customer.service.kydj.J3YhsKydjGtService;
import com.sqxxcx.util.base.AvailableResult;

@RestController
@RequestMapping(value="/kydj")
public class J3YhsKydjGtController {
	
	private Logger logger = LoggerFactory.getLogger(J3YhsKydjGtController.class);
	
	@Autowired
	private J3YhsKydjGtService j3YhsKydjGtService;

	@RequestMapping(value="/selectYhsKydjGt",method= RequestMethod.POST)
	public AvailableResult<J3YhsKydjGtResVo> selectYhsKydjGt(@RequestBody J3YhsKydjGtReqVo req){
		if(req ==null){
			logger.info("请求参数为空");
		}
		return j3YhsKydjGtService.selectYhsKydjGt(req);
	}
}
