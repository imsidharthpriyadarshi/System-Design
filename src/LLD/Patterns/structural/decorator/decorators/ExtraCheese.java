package LLD.Patterns.structural.decorator.decorators;

import LLD.Patterns.structural.decorator.BasePizza;
import LLD.Patterns.structural.decorator.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    private BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
