package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jl.spring.bean.HelloWorld;

public class MainApp {
	public static void main(String args[]){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("HelloWorld");
		System.out.println(helloWorld.getMessage());
	}
}
