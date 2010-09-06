package eda.batch;

import java.io.File;
import java.util.Collections;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.UnexpectedJobExecutionException;
import org.springframework.batch.core.launch.JobLauncher;

public class FileProcessingJobLauncher {

	private final Job job;

	private final JobLauncher jobLauncher;

	public FileProcessingJobLauncher(Job job, JobLauncher jobLauncher) {
		this.job = job;
		this.jobLauncher = jobLauncher;
	}

	public JobExecution launch(File file) {
		Map<String, JobParameter> map = Collections.singletonMap("input.file.name", new JobParameter(file.getAbsolutePath()));
		JobParameters jobParameters = new JobParameters(map);
		try {
			return this.jobLauncher.run(this.job, jobParameters);
		}
		catch (JobExecutionException e) {
			throw new UnexpectedJobExecutionException("failed to execute job", e);
		}
	}

}
