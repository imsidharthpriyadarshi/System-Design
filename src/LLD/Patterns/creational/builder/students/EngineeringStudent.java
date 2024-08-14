package LLD.Patterns.creational.builder.students;

import LLD.Patterns.creational.builder.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudent extends StudentBuilder {
    @Override
    public StudentBuilder setSubject() {
        List<String> subject= new ArrayList<>();
        subject.add("Dsa");
        subject.add("Cn");
        this.set_subject(subject);
        return this;

    }
}
