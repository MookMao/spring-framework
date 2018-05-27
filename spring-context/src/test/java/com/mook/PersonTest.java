package com.mook;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PersonTest {
//	@Before
//	public void setUp() throws Exception {
//		ClassPathXmlApplicationContext ctx =
//				new ClassPathXmlApplicationContext(getClass().getSimpleName() + ".xml", getClass());
//	}

	@Test
	public void testBeanCreated() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		System.out.println(loader.getResource("").getPath()); // Users/mook/spring-framework/spring-context/out/test/classes/

		System.out.println(getClass().getSimpleName());

		// 实例化容器
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mook/PersonTest.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getClass().getName()); // com.mook.Person


//		GenericApplicationContext context = new GenericApplicationContext();
//		new XmlBeanDefinitionReader(context).loadBeanDefinitions("classpath:person.xml");
//		context.refresh();
//		System.out.println(context.getBean("person", Person.class).getClass().getName());

/**
		// XmlBeanFactory容器创建过程
		// 根据Xml配置文件创建Resource资源对象，该对象中包含了BeanDefinition的信息
		ClassPathResource resource = new ClassPathResource("PersonTest.xml");
		// 创建DefaultListableBeanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 创建XmlBeanDefinitionReader读取器，用于载入BeanDefinition。
		// 之所以需要BeanFactory作为参数，是因为会将读取的信息回调配置给factory
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		// XmlBeanDefinitionReader执行载入BeanDefinition的方法，最后会完成Bean的载入和注册。
		// 完成后Bean就成功的放置到IOC容器当中，以后我们就可以从中取得Bean来使用
		reader.loadBeanDefinitions(resource);
		System.out.println(((Person)factory.getBean("person")).getClass().getName());
*/

		// ApplicationContext容器创建过程


	}
}
