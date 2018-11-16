package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setterInjection.Employee;

public class SetterMain {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Setter.xml");
		  
	      
		    Employee e=(Employee)context.getBean("obj");  
		    e.display(); 
	}

}
