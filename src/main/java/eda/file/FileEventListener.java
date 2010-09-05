package eda.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.ApplicationListener;
import org.springframework.util.FileCopyUtils;

public class FileEventListener implements ApplicationListener<FileEvent> {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Override
	public void onApplicationEvent(FileEvent event) {
		File file = event.getFile();
		try {
			logger.info(file.getName() + ": " + FileCopyUtils.copyToString(new FileReader(file)));
		}
		catch (IOException e) {
			logger.warn("IOException in FileEventListner", e);
		}
	}

}
