package LLD.Patterns.structural.compositePattern.calculator;

public class Expression implements ArthmaticExpression {
    private ArthmaticExpression leftExpression;
    private ArthmaticExpression rightExpression;
    private Operations operations;

    public Expression(ArthmaticExpression leftExpression, ArthmaticExpression rightExpression, Operations operations) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operations = operations;
    }

    @Override

    public int evaluate() {
        int temp=0;
        switch (operations){
            case ADD -> temp=leftExpression.evaluate() +rightExpression.evaluate();
            case MULTIPLY ->temp=leftExpression.evaluate()*rightExpression.evaluate();
            case DIVIDE -> temp=leftExpression.evaluate()/rightExpression.evaluate();
            case SUBTRACT -> temp= leftExpression.evaluate()-rightExpression.evaluate();
        }
        return temp;
    }
}
