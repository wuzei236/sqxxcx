package com.sqxxcx.customer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sqxxcx.util.base.AvailableResult;
import com.sqxxcx.customer.api.service.IDmpzzlService;
import com.sqxxcx.customer.api.vo.DmpzzlReqVo;
import com.sqxxcx.customer.api.vo.DmpzzlResVo;

@Component
public class DmpzzlService {
	
	private Logger logger = LoggerFactory.getLogger(DmpzzlService.class);

	@Autowired
	private IDmpzzlService iDmpzzlService;
	
	//除查询以外方法需添加事务注解，方法抛出异常即进行数据回滚，事务注解如下注释所示
//	@Transactional(rollbackFor=SqxxcxException.class)
	public AvailableResult<DmpzzlResVo> selectDmPzzl(DmpzzlReqVo req){
		if(req == null){
			//要求参数不为空可以在此处或者
			logger.info("请求参数为空");
		}
		return iDmpzzlService.selectDmPzzl(req);
	}
}
