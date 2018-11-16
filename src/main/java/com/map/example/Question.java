package com.map.example;

import java.util.Iterator;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {  
	 
		private int id;  
		private String name;  
		private Map<Answer,user> answers;  
		  
		public Question() {}  
		public Question(int id, String name, Map<Answer, user> answers) {  
		    super();  
		    this.id = id;  
		    this.name = name;  
		    this.answers = answers;  
		}  
		  
		  
		public void displayInfo(){  
		    System.out.println("question id:"+id);  
		    System.out.println("question name:"+name);  
		    System.out.println("Answers....");  
		    Set<Entry<Answer, user>> set=answers.entrySet();  
		    Iterator<Entry<Answer, user>> itr=set.iterator();  
		    while(itr.hasNext()){  
		        Entry<Answer, user> entry=itr.next();  
		        Answer ans=entry.getKey();  
		        user user=entry.getValue();  
		        System.out.println("Answer Information:");  
		        System.out.println(ans);  
		        System.out.println("Posted By:");  
		        System.out.println(user);  
		    }  
		}  
}  


