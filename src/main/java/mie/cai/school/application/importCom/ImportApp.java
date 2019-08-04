package mie.cai.school.application.importCom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(applicationContext);
    }
}
