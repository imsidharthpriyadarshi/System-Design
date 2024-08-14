package LLD.Patterns.creational.factory.shapes;

import LLD.Patterns.creational.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
