package mie.cai.school.application.profile;

import mie.cai.school.application.cycle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    @Bean
    public Car car() {
        return new Car();
    }
}
