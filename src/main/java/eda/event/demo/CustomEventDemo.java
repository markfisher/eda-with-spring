package eda.event.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eda.event.CustomEvent;

public class CustomEventDemo {

	public static void main(String... args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("custom-context.xml", CustomEventDemo.class);
		context.start();
		context.publishEvent(new CustomEvent("foo"));
		context.stop();
	}

}
