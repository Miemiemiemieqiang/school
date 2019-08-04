package mie.cai.school.application.importCom;

import mie.cai.school.beans.Student;
import org.springframework.beans.factory.FactoryBean;

public class StudentFactoryBean implements FactoryBean<Student> {
    @Override
    public Student getObject() {
        return new Student("Cai");
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
