package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.A;

public class Autowiring {
	public static void main(String[] args) {  
		
	    @SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiring.xml");  
	    A a=(A)context.getBean("a",A.class);  
	    a.display();  
	}  

}
