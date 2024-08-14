package LLD.Patterns.structural.compositePattern.fileSystem.normal;

public class File {
    private String name;
    public File(String name){
        this.name=name;
    }
    public void ls(){
        System.out.println("    File Name: "+this.name);
    }
}
