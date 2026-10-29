package com.example.calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java -jar basic-calculator.jar <number> <operator> <number>");
            System.out.println("Operators: + - * /");
            return;
        }

        Calculator calculator = new Calculator();
        double first = Double.parseDouble(args[0]);
        String operator = args[1];
        double second = Double.parseDouble(args[2]);

        double result;
        switch (operator) {
            case "+":
                result = calculator.add(first, second);
                break;
            case "-":
                result = calculator.subtract(first, second);
                break;
            case "*":
                result = calculator.multiply(first, second);
                break;
            case "/":
                result = calculator.divide(first, second);
                break;
            default:
                System.out.println("Unknown operator: " + operator);
                return;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
}
