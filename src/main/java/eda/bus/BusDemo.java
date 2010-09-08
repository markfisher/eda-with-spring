package eda.bus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusDemo {

	public static void main(String... args) {
		new ClassPathXmlApplicationContext("context.xml", BusDemo.class);
	}

}
