package com.eteration.demo.enums;
public enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    public double calculate(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }

}