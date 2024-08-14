package LLD.Patterns.behavioral.iterator.types;

public class Person {
    private String name;
    private int age;
    private boolean is_married;

    public Person(String name, int age, boolean is_married) {
        this.name = name;
        this.age = age;
        this.is_married = is_married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIs_married() {
        return is_married;
    }

    public void setIs_married(boolean is_married) {
        this.is_married = is_married;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+
                " Age: "+this.age+
                " Married: "+this.is_married;
    }
}
