package org.example;

public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String display() {
        System.out.println("Called Variable.display()");
        return name;
    }
}

