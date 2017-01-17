package com.lwx.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {  
	
	//该方法是一个前置通知：在目标方法开始之前执行
	@Before("execution (public int com.lwx.spring.aop.impl.ArithmeticCalculator.*(int, int))")
	public void beforeMethod( JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("The Method " + methodName + " begins with " + args);
	}
}
