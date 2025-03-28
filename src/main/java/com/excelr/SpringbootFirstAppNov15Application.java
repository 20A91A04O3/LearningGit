package com.excelr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootFirstAppNov15Application {

	public static void main(String[] args) {
//		IOC starts
		ApplicationContext con =  SpringApplication.run(SpringbootFirstAppNov15Application.class, args);
		System.out.println("....Welcome to springboot....");
		
		A a1 = con.getBean(A.class);
		
	}
}
