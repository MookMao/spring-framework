package com.mook;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void testBeanCreated() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		System.out.println(loader.getResource("").getPath()); // Users/mook/spring-framework/spring-context/out/test/classes/
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:person.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getClass().getName()); // com.mook.Person

	}
}
