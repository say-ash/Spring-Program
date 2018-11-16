package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siCollection2.Question;



public class siCollection2 {
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Sicollection2.xml");
		Question r=(Question)context.getBean("q");  
	    r.displayInfo(); 
	    

}
}
