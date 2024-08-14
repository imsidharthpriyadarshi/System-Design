package LLD.Patterns.structural.compositePattern.calculator;

public class Main {
    public static void main(String[] args) {
        ArthmaticExpression number1= new Number(2);
        ArthmaticExpression expression1=new Expression(new Expression(new Number(23),new Number(2),Operations.MULTIPLY),new Number(33),Operations.ADD);

        ArthmaticExpression finalExpression= new Expression(number1,expression1,Operations.ADD);
        System.out.println(finalExpression.evaluate());

    }
}
