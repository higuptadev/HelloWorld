package com.in30min.learnspringframeworkcom.in40min.learnspringframework.d1;


import java.util.Arrays;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class ClassA{
	
}
@Component
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA ClassB) {
		
		System.out.println("Some Intilization");
		this.classA=classA;
	}
	public void doSomething() {
		System.out.println("do something");
	}
}

@Configuration
@Component
public class LazyInitilizationLuncherApplication {

	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext
				(LazyInitilizationLuncherApplication.class)){
			System.out.println("Intialization of Context");
			context.getBean(ClassB.class).doSomething();
		}

	}
}

