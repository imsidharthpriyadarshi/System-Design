package LLD.Patterns.creational.factory;

import LLD.Patterns.creational.factory.shapes.Circle;
import LLD.Patterns.creational.factory.shapes.Rectangle;
import LLD.Patterns.creational.factory.shapes.Square;

public class ShapeFactory {
    public Shape getShape(String shape){
        switch (shape.toLowerCase()){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return  null;
        }
    }
}
