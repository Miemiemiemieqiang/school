package mie.cai.school.application.scan.component;

import mie.cai.school.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class
 *
 * @author caikaiqiang on 2019-07-30
 */
@Configuration
public class BaseConfiguration {

    @Bean
    public Student student() {
        return new Student("aa");
    }
}
