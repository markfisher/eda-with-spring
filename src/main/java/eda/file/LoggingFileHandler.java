package eda.file;

import java.io.File;
import java.io.FileReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.util.FileCopyUtils;

public class LoggingFileHandler implements FileHandler {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Override
	public void handle(File file) throws Exception {
		logger.info(file.getName() + ": " + FileCopyUtils.copyToString(new FileReader(file)));
	}

}
