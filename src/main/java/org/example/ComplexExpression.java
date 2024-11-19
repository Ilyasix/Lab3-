package org.example;

import java.util.ArrayList;
import java.util.List;

public class ComplexExpression implements Expression {
    private final Expression left;
    private final String operator;
    private final Expression right;

    public ComplexExpression(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String display() {
        System.out.println("Called ComplexExpression.display()");
        return "(" + left.display() + " " + operator + " " + right.display() + ")";
    }
}


