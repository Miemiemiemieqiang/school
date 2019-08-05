package mie.cai.school.timetask;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * OutJob class
 *
 * @author caikaiqiang on 2019-08-05
 */
public class OutJob implements Job, Cloneable {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("In");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Out");
    }

    @Override
    protected OutJob clone() throws CloneNotSupportedException {
        return (OutJob) super.clone();
    }
}
