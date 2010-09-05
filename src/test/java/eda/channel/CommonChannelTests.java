package eda.channel;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class CommonChannelTests {

	@Test
	public void run() throws InterruptedException {
		Thread.sleep(5 * 60 * 1000);
	}

}
