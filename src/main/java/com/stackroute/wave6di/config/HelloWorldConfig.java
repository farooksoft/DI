package com.stackroute.wave6di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stackroute.wave6di.dao.Employee;
import com.stackroute.wave6di.dao.EmployeeImpl;
import com.stackroute.wave6di.dao.HelloWorld;
import com.stackroute.wave6di.dao.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {

	@Bean (name = "helloworldbean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
	
	@Bean (name = "helloworldbean1")
	public Employee employee() {
		return new EmployeeImpl();
	}
}
