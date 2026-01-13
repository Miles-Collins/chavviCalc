package com.chavviCalc;

public class CalculatorModel {

    private double a = 0.0;
    private double b = 0.0;
    private double result = 0.0;

    public double getResult() {
        return result;
    }

    public void setResult(double value) {
        this.result = value;
    }

    public double add(double a, double b) {
        this.a = a;
        this.b = b;
        this.a = a + b;
        result = this.a;
        return result;
    }

    public double subtract(double a, double b) {
        this.a = a;
        this.b = b;
        this.a = a - b;
        result = this.a;
        return result;
    }

    public double multiply(double a, double b) {
        this.a = a;
        this.b = b;
        this.a = a * b;
        result = this.a;
        return result;
    }

    public double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("ERROR: Cannot divide by zero");
        }
        this.a = a;
        this.b = b;
        this.a = a / b;
        result = this.a;
        return result;
    }

    public void reset() {
        result = 0.0;
    }

    public void setA(double value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setA'");
    }
}
