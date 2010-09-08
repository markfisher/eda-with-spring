package eda.file.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileEventDemo {

	public static void main(String... args) {
		new ClassPathXmlApplicationContext("event-context.xml", FileEventDemo.class);
	}

}
