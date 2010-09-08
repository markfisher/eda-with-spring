package eda.event;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CustomEvent extends ApplicationEvent {

	public CustomEvent(String s) {
		super(s);
	}

}
