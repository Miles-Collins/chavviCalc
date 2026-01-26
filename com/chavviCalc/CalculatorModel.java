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

    public double add() {
        result = roundToThreeDecimalPlaces(a + b);
        a = result;
        return result;
    }

    public double subtract() {
        result = roundToThreeDecimalPlaces(a - b);
        a = result;
        return result;
    }

    public double multiply() {
        result = roundToThreeDecimalPlaces(a * b);
        a = result;
        return result;
    }

    public double divide() throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        result = roundToThreeDecimalPlaces(a / b);
        a = result;
        return result;
    }

    public void reset() {
        a = 0.0;
        b = 0.0;
        result = 0.0;
    }

    public void setA(double value) {
        this.a = roundToThreeDecimalPlaces(value);
    }

    public void setB(double value) {
        this.b = roundToThreeDecimalPlaces(value);
    }

    public double roundToThreeDecimalPlaces(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
