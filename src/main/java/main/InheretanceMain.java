package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inheretance.Employee;
import com.map.example.Question;

public class InheretanceMain {
	public static void main(String[] args) {  
	   
	  
	    ApplicationContext context = new ClassPathXmlApplicationContext("inheretance.xml");
		  
	      
	    Employee e1=(Employee)context.getBean("e2");  
	    e1.show(); 
	      
	      
	}  

}
