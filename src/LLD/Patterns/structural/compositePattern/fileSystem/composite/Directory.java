package LLD.Patterns.structural.compositePattern.fileSystem.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String name;
    private List<FileSystem> fileSystems;


    public Directory(String name){
        this.name= name;
        this.fileSystems= new ArrayList<>();
    }
    public Directory(String name, List<FileSystem> fileSystems) {
        this.fileSystems = fileSystems;
        this.name = name;
    }
    public void add(FileSystem fileSystem){
        this.fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println(this.name+": ");
     for (FileSystem fileSystem:this.fileSystems){

         fileSystem.ls();
     }
    }
}
