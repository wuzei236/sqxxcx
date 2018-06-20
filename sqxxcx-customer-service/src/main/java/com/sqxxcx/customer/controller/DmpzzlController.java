package com.sqxxcx.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqxxcx.util.base.AvailableResult;
import com.sqxxcx.customer.api.vo.DmpzzlReqVo;
import com.sqxxcx.customer.api.vo.DmpzzlResVo;
import com.sqxxcx.customer.service.DmpzzlService;

@RestController
@RequestMapping(value="/dmpzzl")
public class DmpzzlController {
	
	private Logger logger = LoggerFactory.getLogger(DmpzzlController.class);
	
	@Autowired
	private DmpzzlService dmpzzlService;

	//页面传入DmpzzlReqVo对象，条件查询yhs_mdm_db.v_g3_dm_pzzl表数据，url为@RequestMapping注解中value对应的值
	@RequestMapping(value="/selectDmPzzl")
	public AvailableResult<DmpzzlResVo> selectDmPzzl(DmpzzlReqVo req){
		if(req == null){
			//要求参数不为空可以在此处抛出异常或者在请求的参数处增加@RequestParam(required = true)
			logger.info("请求参数为空");
		}
		return dmpzzlService.selectDmPzzl(req);
	}
	
}
