package LLD.Patterns.creational.builder;

import LLD.Patterns.creational.builder.students.EngineeringStudent;

public class Main {
    public static void main(String[] args) {
        //**Builder method
        StudentBuilder studentBuilder= new EngineeringStudent();
        Student st1=studentBuilder.setAge(22).setName("Sidharth").setFather_name("Pankaj").build();
        System.out.println(st1.getAge()+" "+st1.getName()+" "+st1.getFather_name());

    }
}
