package mie.cai.school.timetask;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Scheduletest class
 *
 * @author caikaiqiang on 2019-08-05
 */
public class ScheduleTest {
    public static void main(String[] args) throws SchedulerException, InterruptedException, CloneNotSupportedException {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        JobDetail jobDetail = JobBuilder.newJob(OutJob.class).withIdentity("name").build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("name").startNow()
                .withSchedule(CronScheduleBuilder.cronSchedule("*/1 * * * * ?")).build();
        scheduler.scheduleJob(jobDetail, trigger);
        JobDetail job2 = JobBuilder.newJob(OutJob.class).withIdentity("name2").build();
        Trigger trigger2 = TriggerBuilder.newTrigger().startNow()
                .withSchedule(CronScheduleBuilder.cronSchedule("*/2 * * * * ?")).build();
        scheduler.scheduleJob(job2, trigger2);
        scheduler.start();
        Thread.sleep(10000);
        scheduler.shutdown();

        OutJob outJob = new OutJob();
        OutJob clone = outJob.clone();
        System.out.println(outJob.equals(clone));
    }
}
