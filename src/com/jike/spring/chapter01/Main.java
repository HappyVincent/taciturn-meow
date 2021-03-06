package com.jike.spring.chapter01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		Resource r = new FileSystemResource("helloMessage.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Person p = (Person)f.getBean("person");
		String s = p.sayHello();
		System.out.println(s);
	}

}
