package mie.cai.school.application.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XMLApp class
 *
 * @author caikaiqiang on 2019-07-30
 */
public class XMLApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(applicationContext.isRunning());
        System.out.println(applicationContext.isSingleton("student"));
        System.out.println(applicationContext.getBean("student"));
    }
}
