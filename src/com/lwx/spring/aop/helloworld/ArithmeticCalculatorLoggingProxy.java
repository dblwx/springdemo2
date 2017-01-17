package com.lwx.spring.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

public class ArithmeticCalculatorLoggingProxy {
	
	//Ҫ����Ķ���
	private ArithmeticCalculator target;
	
	public ArithmeticCalculatorLoggingProxy (ArithmeticCalculator target){
		this.target = target;
	}
	
	public ArithmeticCalculator getLoggingProxy(){
		ArithmeticCalculator proxy = null;
		//�����������һ����������������
		ClassLoader loader = target.getClass().getClassLoader();
		//�����������ͣ�����������Щ����
		Class [] interfaces = new Class[]{ArithmeticCalculator.class};
		//�����ô���������еķ���ʱ����ִ�еĴ���
		InvocationHandler h = new InvocationHandler() {
			/**
			 * proxy:���ڷ��صĴ������һ������£�invoke�����ж���ʹ�øö���
			 * method:���ڱ����õķ���
			 * args:���÷���ʱ������Ĳ���
			 */
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				String methodName = method.getName();
				//��־
				System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
				//ִ�з���
				Object result = method.invoke(target, args);
				System.out.println("The method " + methodName + " ends with " + result);
				return result;
			}
		};
		proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}
