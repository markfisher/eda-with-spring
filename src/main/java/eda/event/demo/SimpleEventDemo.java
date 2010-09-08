package eda.event.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleEventDemo {

	public static void main(String... args) {
		new ClassPathXmlApplicationContext("simple-context.xml", SimpleEventDemo.class);
	}

}












//ClassPathXmlApplicationContext context =...
//context.start();
//context.publishEvent(new TestEvent("foo"));
//context.stop();