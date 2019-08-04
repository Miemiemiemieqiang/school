package mie.cai.school.application.importCom;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {StudentSelector.class, StudentRegister.class})
public class MainConfig {

}
