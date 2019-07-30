package mie.cai.school.application.configuration;

import mie.cai.school.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MainConfig class
 *
 * @author caikaiqiang on 2019-07-30
 */
@Configuration
public class MainConfig {

    @Bean
    public Student student() {
        return new Student("caicai");
    }
}
