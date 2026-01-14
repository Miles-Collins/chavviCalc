package com.chavviCalc;

public class CalculatorView {

    private CalculatorModel model;

    private static void printMenuLine() {
        System.out.println(
                "----------------------------------------------------------"
        );
    }

    private static void printMenuCommand(Character command, String desc) {
        System.out.printf("%s\t%s\n", command, desc);
    }

    // prints the menu
    public void printMenu(double a, double b) {
        printMenuLine();
        System.out.println("Chavvi Calc - Calculator Menu");
        printMenuLine();
        System.out.println("A = " + model.getA(a) + "     " + "B = " + model.getB(b));
        printMenuCommand('a', "Enter a value for A");
        printMenuCommand('b', "Enter a value for B");
        printMenuCommand('+', "Add");
        printMenuCommand('-', "Subtract");
        printMenuCommand('*', "Multiply");
        printMenuCommand('/', "Divide");
        printMenuCommand('c', "Clear");
        printMenuCommand('q', "Quit");
        printMenuLine();
    }

    public void printPrompt(String prompt) {
        System.out.print(prompt);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printError(String errorMessage) {
        System.out.println("ERROR: " + errorMessage);
    }

    public void printResult(double result) {
        System.out.printf("Result: %.2f\n", result);
    }

    public void printQuitMessage() {
        System.out.println("Thank you for using Chavvi Calculator!");
    }
}
