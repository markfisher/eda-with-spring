package eda.batch;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class FileProcessingTests {

	@Test
	public void run() throws IOException {
		System.in.read();
	}

}
