package com.lwx.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.����Spring��IOC����
		
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л�ȡbean��ʵ��
		
		ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);
//		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
		
		//3.ʹ��bean
		
		int result = arithmeticCalculator.add(1, 2);
		System.out.println(result);
	}

}
