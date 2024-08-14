package LLD.Patterns.structural.proxyPattern;

public class EmployeeObj {
    private int id;
    private String name;
    private boolean is_married;

    public EmployeeObj(int id, String name, boolean is_married) {
        this.id = id;
        this.name = name;
        this.is_married = is_married;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_married() {
        return is_married;
    }

    public void setIs_married(boolean is_married) {
        this.is_married = is_married;
    }

    @Override
    public String toString() {
        return "EmployeeObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", is_married=" + is_married +
                '}';
    }
}
