package LLD.Patterns.structural.proxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    private EmployeeDao employeeDaoConcrete ;
    public EmployeeDaoProxy(EmployeeDao employeeDao){
        this.employeeDaoConcrete=employeeDao;
    }
    @Override
    public void create(String client, EmployeeObj obj) {
        System.out.println("All condition got checked");
        employeeDaoConcrete.create(client,obj);
    }

    @Override
    public void delete(String client, EmployeeObj obj) {

    }

    @Override
    public EmployeeObj get(String client, int emp_id) {
        return null;
    }
}
