package com.lwx.spring.aop.helloworld;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		ArithmeticCalculator arithmeticCalculator = null;
//		arithmeticCalculator  = new ArithmeticCalculatorImpl();
		
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		int result = proxy.add(1, 2);
		System.out.println(result);
	}
}
