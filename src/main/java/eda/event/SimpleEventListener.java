package eda.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class SimpleEventListener implements ApplicationListener<ApplicationEvent> {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		this.logger.info("received event: " + event);
	}

}
