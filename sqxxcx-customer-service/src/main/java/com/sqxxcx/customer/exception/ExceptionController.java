//package com.sqxxcx.customer.exception;

//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.shiro.authz.UnauthorizedException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
///**
// * 统一拦截cas单点登录异常
// * 
// * @Description:TODO
// */
//@ControllerAdvice
//public class ExceptionController {
//	@ExceptionHandler(value = UnauthorizedException.class) // 处理访问方法时权限不足问题
//	public String defaultErrorHandler(HttpServletRequest req, Exception e) {
//		return "你无权访问该方法！---403";
//	}
//}
