package LLD.Patterns.structural.compositePattern.calculator;

public class Number implements ArthmaticExpression {
    private int val;
    public Number(int val){
        this.val=val;
    }
    @Override
    public int evaluate() {
        return this.val;
    }
}
