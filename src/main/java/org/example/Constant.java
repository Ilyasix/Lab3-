package org.example;

public class Constant implements Expression {
    private final int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public String display() {
        System.out.println("Called Constant.display()");
        return String.valueOf(value);
    }
}
