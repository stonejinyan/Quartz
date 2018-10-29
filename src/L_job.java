import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class L_job implements Job {
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Quartz-Job-Execute:定时器：5秒---测试结果：" + new Date());
	}
}