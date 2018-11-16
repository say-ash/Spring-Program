package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SiCollectionExample.Question;

  

public class Sicollection {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sicollection.xml");
		  
	      
	    Question r=(Question)context.getBean("q");  
	    r.displayInfo(); 

}
}
