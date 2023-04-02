package com.in30min.learnspringframeworkcom.in40min.learnspringframework.d1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name , int age , String Adress) {};
record Adress (int Areacode ,String cityname ) {};
@Configuration
public class HelloWorldConfiguration {
@Bean
	public String name () {
		return "Ranga ";
	}
@Bean
public int Age () {
	return 20;
}
@Bean
public String Adress () {
	return "Rangth_nath_Mahal_1203 ";
}
@Bean
public Person person () {
	var person = new Person("Ravi",20, "Jaithra,Etah");
	return person;
}
@Bean("adress2")
public Adress adress() {
	 
	return new Adress(207249, "Etah");
}
}
