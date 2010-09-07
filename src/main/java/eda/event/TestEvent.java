package eda.event;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class TestEvent extends ApplicationEvent {

	public TestEvent(String s) {
		super(s);
	}

}
