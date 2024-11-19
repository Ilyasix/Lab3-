package org.example;

public class LoggingDecorator extends ExpressionDecorator {
    public LoggingDecorator(Expression wrappedExpression) {
        super(wrappedExpression);
    }

    @Override
    public String display() {
        System.out.println("LoggingDecorator: display() called");
        return wrappedExpression.display();
    }
}

