package LLD.Patterns.structural.decorator.decorators;

import LLD.Patterns.structural.decorator.BasePizza;
import LLD.Patterns.structural.decorator.ToppingDecorator;

public class Mashroom extends ToppingDecorator {
    private BasePizza basePizza;
    public Mashroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+35;
    }
}
