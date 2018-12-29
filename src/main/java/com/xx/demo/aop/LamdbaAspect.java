package com.xx.demo.aop;


import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LamdbaAspect {

    private Logger logger = LoggerFactory.getLogger(LamdbaAspect.class);

    //定义切入点
    @Pointcut("execution(public * com.xx.demo.lamdba.TestLamdba.testlamdba())")
    public void lamdbalog(){}

    @Before("lamdbalog()")
    public void doBefore(){
        logger.info("方法开始之前的时间:" +System.currentTimeMillis());
    }

    @After("lamdbalog()")
    public void doAfter(){
        logger.info("方法结束后的时间:" +System.currentTimeMillis());
   }
}
