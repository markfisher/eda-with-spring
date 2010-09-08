package eda.batch.demo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchDemo {

	public static void main(String... args) throws IOException {
		new ClassPathXmlApplicationContext("context.xml", BatchDemo.class);
	}

}
