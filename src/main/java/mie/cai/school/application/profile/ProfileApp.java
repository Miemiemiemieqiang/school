package mie.cai.school.application.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(applicationContext);
    }
}
