package eda.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Override
	public void onApplicationEvent(CustomEvent event) {
		this.logger.info("received event: " + event);
	}

}
