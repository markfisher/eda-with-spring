package eda.event;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleEventListenerTests {

	@Autowired
	private volatile AbstractApplicationContext context;

	@Test
	public void run() {
		this.context.start();
		this.context.publishEvent(new TestEvent("foo"));
		this.context.stop();
	}

}
