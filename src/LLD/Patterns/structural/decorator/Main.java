package LLD.Patterns.structural.decorator;

import LLD.Patterns.structural.decorator.basePizza.Vegdelight;
import LLD.Patterns.structural.decorator.decorators.ExtraCheese;
import LLD.Patterns.structural.decorator.decorators.ExtraVegies;
import LLD.Patterns.structural.decorator.decorators.Mashroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new ExtraCheese(new Mashroom( new ExtraVegies(new ExtraCheese(new Vegdelight()))));
        System.out.println(basePizza.cost());

    }
}
