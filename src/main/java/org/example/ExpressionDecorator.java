package org.example;

public abstract class ExpressionDecorator implements Expression {
    protected final Expression wrappedExpression;

    public ExpressionDecorator(Expression wrappedExpression) {
        this.wrappedExpression = wrappedExpression;
    }
}

