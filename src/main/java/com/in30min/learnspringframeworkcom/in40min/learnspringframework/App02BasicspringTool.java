package com.in30min.learnspringframeworkcom.in40min.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02BasicspringTool {

	public static void main(String[] args) {
	//Launch a spring Context
		
		var context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// Configure the things that we want spring to manage 
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("Age"));
	System.out.println(context.getBean("Adress"));
	System.out.println(context.getBean("person"));
	System.out.println(context.getBean("adress2"));
	System.out.println(context.getBean(Adress.class));
	}

}
