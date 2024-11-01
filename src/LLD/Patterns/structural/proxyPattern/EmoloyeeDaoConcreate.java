package LLD.Patterns.structural.proxyPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public abstract class EmoloyeeDaoConcreate implements EmployeeDao{
    private HashMap<String, List<EmployeeObj>> table;
    public EmoloyeeDaoConcreate(){
        table= new HashMap<>();
    }
    @Override
    public void create(String client, EmployeeObj obj) {
        if (table.containsKey(client)){
            table.get(client).add(obj);
        }else{
            table.put(client,new ArrayList<>(Arrays.asList(obj)));
        }
        System.out.println("Employee created successfully");
    }

    @Override
    public void delete(String client, EmployeeObj obj) {
        if (table.containsKey(client)){
            if(table.get(client).contains(obj)){
                table.get(client).remove(obj);
            }else {
                System.out.println("Employee does not exist");
            }
        }else{
            System.out.println("This client does not exist");
        }

    }

    @Override
    public EmployeeObj get(String client, int emp_id) {
        List<EmployeeObj> temp= table.get(client);
        return null;
    }
}
