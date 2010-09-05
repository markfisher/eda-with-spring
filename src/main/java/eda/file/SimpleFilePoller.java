package eda.file;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.util.Assert;

public class SimpleFilePoller implements FilePoller {

	private final File directory;

	private final LastModifiedFilter lastModifiedFilter = new LastModifiedFilter();

	private final Log logger = LogFactory.getLog(this.getClass());


	public SimpleFilePoller(File directory) {
		Assert.notNull(directory, "directory must not be null");
		if (!directory.exists()) {
			directory.mkdir();
		}
		Assert.isTrue(directory.isDirectory(), directory + " is not a directory");
		this.directory = directory;
		logger.info("Created FilePoller for directory: " + this.directory);
	}


	@Override
	public List<File> poll() {
		try {
			return Arrays.asList(this.directory.listFiles(this.lastModifiedFilter));
		}
		finally {
			this.lastModifiedFilter.lastPoll = System.currentTimeMillis();
		}
	}


	private static class LastModifiedFilter implements FileFilter {

		private volatile long lastPoll = 0;

		@Override
		public boolean accept(File file) {
			return (file.lastModified() >= this.lastPoll);
		}
	}

}
