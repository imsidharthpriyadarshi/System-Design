package LLD.Patterns.structural.compositePattern.fileSystem.normal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory movies= new Directory("movies");
        movies.addObject(new File("Gadder: Ek prem katha"));
        List<Object> comedy_movies= new ArrayList<>();
        comedy_movies.add(new File("Golmal"));
        comedy_movies.add(new File("Dhamal"));
        comedy_movies.add(new File("Welcome"));
        movies.addObject(new Directory("Comedy",comedy_movies));

        List<Object> action_movies= new ArrayList<>();
        action_movies.add(new File("Action Jackson"));
        action_movies.add(new File("Mission impossible"));
        action_movies.add(new File("Mission impossible 2"));
        movies.addObject(new Directory("Action",action_movies));
        System.out.println("movies:");
        movies.ls();

    }
}
