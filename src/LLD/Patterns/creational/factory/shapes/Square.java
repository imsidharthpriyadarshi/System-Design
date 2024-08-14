package LLD.Patterns.creational.factory.shapes;

import LLD.Patterns.creational.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
