package mie.cai.school.application.scan;

import mie.cai.school.application.scan.component.ComService;
import mie.cai.school.beans.Student;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * ScanConfig class
 *
 * @author caikaiqiang on 2019-07-30
 */
@Configuration
@ComponentScan(basePackages = {"mie.cai.school.application.scan.component"},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {ComService.class})},
        useDefaultFilters = false)
public class ScanIncludeConfig {
    @Bean
    public Student student() {
        return new Student("Cai");
    }

    @Bean
    @Scope(value = "prototype")
    public Student studentPrototype() {
        return new Student("Cai");
    }

    @Bean
    @Lazy
    public Student studentLazy() {
        return new Student("Cai");
    }

    @Bean
    @Conditional(value = StudentConditional.class)
    public Student studentConditional() {
        return new Student("Cai");
    }
}
