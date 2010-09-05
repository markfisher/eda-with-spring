package eda.file;

import java.io.File;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class FileEvent extends ApplicationEvent {

	public FileEvent(File source) {
		super(source);
	}

	public File getFile() {
		return (File) this.getSource();
	}

}
