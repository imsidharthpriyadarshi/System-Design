package LLD.Patterns.structural.compositePattern.fileSystem.normal;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<Object> objects;
    public Directory(String name){
        this.name=name;
        this.objects=new ArrayList<>();

    }
    public Directory(String name, List<Object> objects){
        this.name=name;
        this.objects= objects;
    }
    public void addObject(Object obj){
        this.objects.add(obj);

    }

    public void ls(){
        for (Object obj:this.objects){
            if (obj instanceof File){
                File current= (File) obj;
                current.ls();
            }else if (obj instanceof Directory){
                Directory current= (Directory) obj;
                System.out.println(current.name+": ");
                current.ls();

            }
        }
    }
}
