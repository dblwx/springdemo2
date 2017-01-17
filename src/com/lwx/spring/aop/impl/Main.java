package com.lwx.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.创建Spring的IOC容器
		
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中获取bean的实例
		
		ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);
//		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
		
		//3.使用bean
		
		int result = arithmeticCalculator.add(1, 2);
		System.out.println(result);
	}

}
