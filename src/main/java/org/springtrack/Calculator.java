package org.springtrack;

public class Calculator {
    private boolean isCalcOn = false;

    public boolean isOn() {
        return isCalcOn;
    }

    public boolean turnOn() {
        isCalcOn = true;
        return isCalcOn;
    }

    public double add(int a, int b) {
        return a + b;
    }

    public double subtract(int a, int b) {
        return a - b;
    }

    public double multiply(int a, int b) {
        return a * b;
    }

    public String divide(int a, int b) {
        if (b == 0) {
            return "Undefined";
        } else {
            int result = a / b;
            return String.valueOf(result);
        }
    }

    public double power(int a, int b) {
        return Math.pow(a, b);
    }

    public double modulo(int a, int b) {
        return a % b;
    }

}
