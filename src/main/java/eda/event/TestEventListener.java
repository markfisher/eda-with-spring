package eda.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.ApplicationListener;

public class TestEventListener implements ApplicationListener<TestEvent> {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Override
	public void onApplicationEvent(TestEvent event) {
		this.logger.info("received event: " + event);
	}

}
