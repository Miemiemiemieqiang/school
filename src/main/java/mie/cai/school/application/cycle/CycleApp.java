package mie.cai.school.application.cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CycleApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(applicationContext);
    }
}
