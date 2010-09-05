package eda.file;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class FilePollingTaskTests {

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(60 * 1000);
	}

}
