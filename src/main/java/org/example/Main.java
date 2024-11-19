package org.example;

public class Main {
    public static void main(String[] args) {
        Expression const1 = new Constant(5);
        Expression varX = new Variable("x");

        Expression complexExpr = new ComplexExpression(const1, "+", varX);
        Expression loggedExpr = new LoggingDecorator(complexExpr);
        Expression proxiedExpr = new ExpressionProxy(loggedExpr, true);
        System.out.println(proxiedExpr.display());
    }
}
