package eda.file;

import java.io.File;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventPublishingFileHandler implements FileHandler, ApplicationEventPublisherAware {

	private volatile ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public void handle(File file) throws Exception {
		this.publisher.publishEvent(new FileEvent(file));
	}
	
}
