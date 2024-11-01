package LLD.Patterns.creational.builder;

import java.util.List;

public abstract class StudentBuilder {
    private int roll_no;
    private String name;
    private int age;
    private String father_name, mother_name;
    private List<String> subject;
    private String phone;

    public int getRoll_no() {
        return roll_no;
    }

    public StudentBuilder setRoll_no(int roll_no) {
        this.roll_no = roll_no;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getFather_name() {
        return father_name;
    }

    public StudentBuilder setFather_name(String father_name) {
        this.father_name = father_name;
        return this;
    }

    public String getMother_name() {
        return mother_name;
    }

    public StudentBuilder setMother_name(String mother_name) {
        this.mother_name = mother_name;
        return  this;
    }

    public List<String> getSubject() {
        return subject;
    }

    abstract public StudentBuilder setSubject();
    protected void set_subject(List<String> subject){
        this.subject= subject;
    }

    public String getPhone() {
        return phone;
    }

    public StudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}
