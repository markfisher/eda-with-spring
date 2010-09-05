package eda.channel;

import org.springframework.integration.annotation.Header;
import org.springframework.integration.history.MessageHistory;

public class ExampleService {

	public void doSomething(String value, @Header(MessageHistory.HEADER_NAME) MessageHistory history) {
		System.out.println("received: " + value  + " [" + history + "]");
	}

}
