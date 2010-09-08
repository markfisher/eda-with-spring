package eda.file.demo;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.util.CollectionUtils;
import org.springframework.util.FileCopyUtils;

import eda.file.FilePoller;
import eda.file.SimpleFilePoller;

public class SimpleFilePollerDemo {

	private static final String TMPDIR = System.getProperty("java.io.tmpdir");

	private static final Log logger = LogFactory.getLog(SimpleFilePollerDemo.class);

	public static void main(String... args) throws Exception {
		File directory = new File(TMPDIR + File.separator + "/eda-with-spring");
		FilePoller poller = new SimpleFilePoller(directory);
		long count = 0;
		while (count < 12) {
			List<File> files = poller.poll();
			if (!CollectionUtils.isEmpty(files)) {
				for (File file : files) {
					String content = FileCopyUtils.copyToString(new FileReader(file));
					logger.info(file.getName() + ": " + content);
				}
			}
			Thread.sleep(5000);
		}
	}

}
