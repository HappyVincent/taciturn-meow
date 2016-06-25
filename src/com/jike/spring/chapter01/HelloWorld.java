package com.jike.spring.chapter01;

public class HelloWorld implements IHelloMessage {

	@Override
	public String sayHello() {
		return "Hello World!";
	}

}
