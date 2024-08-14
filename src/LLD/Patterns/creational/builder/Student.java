package LLD.Patterns.creational.builder;

import java.util.List;

public class Student {
    private int roll_no;
    private String name;
    private int age;
    private String father_name, mother_name;
    private List<String> subject;
    private String phone;

    public Student(StudentBuilder studentBuilder){
        this.roll_no= studentBuilder.getRoll_no();
        this.name= studentBuilder.getName();
        this.age= studentBuilder.getAge();
        this.father_name= studentBuilder.getFather_name();
        this.subject= studentBuilder.getSubject();
        this.phone= studentBuilder.getPhone();
        this.mother_name=studentBuilder.getMother_name();

    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public List<String> getSubject() {
        return subject;
    }

    public String getPhone() {
        return phone;
    }
}
