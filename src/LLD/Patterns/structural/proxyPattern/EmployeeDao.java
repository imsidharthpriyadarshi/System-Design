package LLD.Patterns.structural.proxyPattern;

public interface EmployeeDao {
    void create(String client, EmployeeObj obj);
    void delete(String client, EmployeeObj obj);
    EmployeeObj get(String client,int emp_id);
}
