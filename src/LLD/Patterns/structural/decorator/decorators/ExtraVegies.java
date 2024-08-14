package LLD.Patterns.structural.decorator.decorators;

import LLD.Patterns.structural.decorator.BasePizza;
import LLD.Patterns.structural.decorator.ToppingDecorator;

public class ExtraVegies extends ToppingDecorator {
    private BasePizza basePizza;
    public ExtraVegies(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
