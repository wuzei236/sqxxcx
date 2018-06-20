//package com.sqxxcx.customer.aop;
//
//import java.util.Arrays;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//@Component
//@Aspect
//public class SystemLogAspect {
//
//    private Logger logger = LoggerFactory.getLogger(SystemLogAspect.class);  
//    
////    @Pointcut("execution(* com.mplus.marketing.controller..*.*(..))")  
////    public void webLog(){}  
//    
//    @Pointcut("execution(* com.sqxxcx.customer.controller..*.*(..))")
//    public void controller() { }
//
//    @Pointcut("execution(* com.sqxxcx.customer.service..*.*(..))")
//    public void service() { }
//
//    @Pointcut("execution(* com.sqxxcx.customer.mapper..*.*(..))")
//    public void mapper() { }
//  
//    @Before("SystemLog()")  
//    public void doBefore(JoinPoint joinPoint) throws Throwable {  
//        // 接收到请求，记录请求内容  
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();  
//        HttpServletRequest request = attributes.getRequest();  
//  
//        // 记录下请求内容  
//        logger.info("URL : " + request.getRequestURL().toString());  
//        logger.info("HTTP_METHOD : " + request.getMethod());  
//        logger.info("IP : " + request.getRemoteAddr());  
//        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());  
//        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));  
////        Object [] args = joinPoint.getArgs();
////        for(int i=0;i<args.length;i++){
////        	Object object = args[i];
////        	
////        	
////        	
////        	
////        	
////        	
////        	System.out.println("==============="+object);
////        }
//    }  
//  
//    @AfterReturning(returning = "ret", pointcut = "SystemLog()")  
//    public void doAfterReturning(Object ret) throws Throwable {  
//        // 处理完请求，返回内容  
//        logger.info("RESPONSE : " + ret);  
//    }  
//}
