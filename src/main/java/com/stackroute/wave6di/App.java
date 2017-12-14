package com.stackroute.wave6di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.stackroute.wave6di.config.HelloWorldConfig;
import com.stackroute.wave6di.dao.Employee;
import com.stackroute.wave6di.dao.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean = (HelloWorld) ctx.getBean("helloworldbean");
        Employee bean1 = (Employee) ctx.getBean("helloworldbean1");
        bean.sayHello("Wave 6");
        bean1.display("Abhishek");
        ctx.close();
    }
}
