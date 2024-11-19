package org.example;

public class ExpressionProxy implements Expression {
    private final Expression realExpression;
    private final boolean hasAccess;

    public ExpressionProxy(Expression realExpression, boolean hasAccess) {
        this.realExpression = realExpression;
        this.hasAccess = hasAccess;
    }

    @Override
    public String display() {
        if (!hasAccess) {
            System.out.println("Access denied to display()");
            return "Access Denied";
        }
        System.out.println("Access granted to display()");
        return realExpression.display();
    }
}
