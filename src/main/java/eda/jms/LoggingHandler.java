package eda.jms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggingHandler {

	private final Log logger = LogFactory.getLog(this.getClass());

	public void log(String message) {
		this.logger.info("received: " + message);
	}

}
