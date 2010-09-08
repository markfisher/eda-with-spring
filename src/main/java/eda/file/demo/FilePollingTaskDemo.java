package eda.file.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FilePollingTaskDemo {

	public static void main(String... args) {
		new ClassPathXmlApplicationContext("polling-context.xml", FilePollingTaskDemo.class);
	}

}
