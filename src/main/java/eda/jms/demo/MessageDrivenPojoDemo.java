package eda.jms.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class MessageDrivenPojoDemo {

	public static void main(String... args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml", MessageDrivenPojoDemo.class);
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		for (int i = 1;; i++) {
			jmsTemplate.convertAndSend("eda.example.mdp", "test-" + i);
			Thread.sleep(5000);
		}
	}

}
