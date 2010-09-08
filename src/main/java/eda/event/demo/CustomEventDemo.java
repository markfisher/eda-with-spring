package eda.event.demo;

import org.junit.runner.RunWith;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eda.event.CustomEvent;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomEventDemo {

	public static void main(String... args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("custom-context", CustomEventDemo.class);
		context.start();
		context.publishEvent(new CustomEvent("foo"));
		context.stop();
	}

}
