package mie.cai.school.application.scan;

import mie.cai.school.application.scan.custom.ComFilterType;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * ScanConfig class
 *
 * @author caikaiqiang on 2019-07-30
 */
@Configuration
@ComponentScan(basePackages = {"mie.cai.school.application.scan.component"},
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = {ComFilterType.class})},
        useDefaultFilters = false)
public class ScanCustomConfig {
}
