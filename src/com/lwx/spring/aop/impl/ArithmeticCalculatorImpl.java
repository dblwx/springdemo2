package com.lwx.spring.aop.impl;

import org.springframework.stereotype.Component;

import com.lwx.spring.aop.impl.ArithmeticCalculator;

@Component("arithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
//		System.out.println("method begins");
		int result = i + j;
//		System.out.println("method ends");
		return result;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		int result = i - j;
		return result;
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
//		System.out.println("method begins");
		int result = i * j;
//		System.out.println("method ends");
		return result;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		int result = i / j;
		return result;
	}

}
