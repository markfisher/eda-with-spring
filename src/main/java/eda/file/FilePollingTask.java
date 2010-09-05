package eda.file;

import java.io.File;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.Assert;

public class FilePollingTask {

	private final FilePoller poller;

	private final FileHandler handler;


	public FilePollingTask(FilePoller poller, FileHandler handler) {
		Assert.notNull(poller);
		Assert.notNull(handler);
		this.poller = poller;
		this.handler = handler;
	}


	@Scheduled(fixedDelay = 5000)
	public void poll() throws Exception {
		List<File> files = this.poller.poll();
		for (File file : files) {
			this.handler.handle(file);
		}
	}

}
