package main;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.map.example.Question;  
public class test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	  
      
    Question q=(Question)context.getBean("q");  
    q.displayInfo();  
      
}  
}

