package mie.cai.school.application.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ConfigApp class
 *
 * @author caikaiqiang on 2019-07-30
 */
public class ConfigApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(applicationContext.getBean("student"));
    }
}
