package mie.cai.school.application.scan;

import mie.cai.school.application.scan.component.ComService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
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
}
