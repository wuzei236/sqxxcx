package com.sqxxcx.customer.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqxxcx.customer.api.model.DmpzzlModel;
import com.sqxxcx.customer.api.service.IDmpzzlService;
import com.sqxxcx.customer.api.vo.DmpzzlReqVo;
import com.sqxxcx.customer.api.vo.DmpzzlResVo;
import com.sqxxcx.customer.mapper.DmpzzlMapper;
import com.sqxxcx.util.base.AvailableResult;
import com.sqxxcx.util.enums.StatusService;

@Service
public class DmpzzlServiceImpl implements IDmpzzlService{
	
	private Logger logger = LoggerFactory.getLogger(DmpzzlServiceImpl.class);
	
	@Autowired
	private DmpzzlMapper dmpzzlMapper;

	/**
	 * 如果返回的数据条数大于1，则需要在api工程中添加model，而响应的vo中属性为List<*Model>，然后返回的响应将此List<*Model>设置入响应的vo，并需要将响应码进行设置，并将部分关键信息输出到日志
	 */
	@Override
	public AvailableResult<DmpzzlResVo> selectDmPzzl(DmpzzlReqVo req) {
		// TODO Auto-generated method stub
		AvailableResult<DmpzzlResVo> availAbleResult = new AvailableResult<DmpzzlResVo>();
		DmpzzlResVo resVo = new DmpzzlResVo();
		List<DmpzzlModel> dmpzzlListList  = dmpzzlMapper.selectDmPzzl(req);
	 	resVo.setDmpzzlList(dmpzzlListList);
	 	//resVo中的响应码和响应信息可以不填，但是availAbleResult必须要填响应码和响应信息，响应信息和响应码需要提供给前端
		resVo.setResultMessage("查询成功！");
		resVo.setReturnCode(200);
		availAbleResult.setData(resVo);
		//如果增删改变动数据为0条，则需要增加if判断，抛出失败的响应码和响应信息
		availAbleResult.setStatusEnum(StatusService.SUCCESS);
		availAbleResult.setReturnMessage("查询成功！返回"+dmpzzlListList.size()+"条数据");
		logger.info("查询成功！返回{}条数据",dmpzzlListList.size());
		return availAbleResult;
	}

}
