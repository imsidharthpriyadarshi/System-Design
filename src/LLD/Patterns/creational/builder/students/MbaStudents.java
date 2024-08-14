package LLD.Patterns.creational.builder.students;

import LLD.Patterns.creational.builder.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class MbaStudents extends StudentBuilder {
    @Override
    public StudentBuilder setSubject() {
        List<String> subject= new ArrayList<>();
        subject.add("mmmm");
        subject.add("Cba");
        this.set_subject(subject);
        return this;
    }
}
