package eda.jms;

import javax.jms.ConnectionFactory;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class MessageDrivenPojoTests {

	@Autowired
	private volatile ConnectionFactory connectionFactory;

	@Test
	public void test() throws InterruptedException {
		JmsTemplate jmsTemplate = new JmsTemplate(this.connectionFactory);
		for (int i = 1; i <= 10; i++) {
			jmsTemplate.convertAndSend("eda.example.mdp", "test-" + i);
			Thread.sleep(5000);
		}
	}

}
