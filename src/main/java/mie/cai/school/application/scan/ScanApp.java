package mie.cai.school.application.scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ScanApp class
 *
 * @author caikaiqiang on 2019-07-30
 */
public class ScanApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanConfig.class);
        System.out.println(applicationContext);
    }
}
