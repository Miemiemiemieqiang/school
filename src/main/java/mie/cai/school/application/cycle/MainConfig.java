package mie.cai.school.application.cycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    @Bean(initMethod = "", destroyMethod = "")
    public Car car() {
        return new Car();
    }
}
