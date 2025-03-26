package org.vedant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
        Employee emp1=(Employee) context.getBean("empid");
        emp1.show();
        System.out.println(emp1.getAge());
    }
}
