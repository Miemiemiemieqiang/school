package mie.cai.school.application.cycle;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
public class Car implements InitializingBean, DisposableBean {
    private String wheel;

    @PostConstruct
    public void init() {

    }

    @Override
    @PreDestroy
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
