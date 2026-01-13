package com.chavviCalc;

public class CalculatorView {

    private static void printMenuLine() {
        System.out.println(
                "----------------------------------------------------------"
        );
    }

    private static void printMenuCommand(Character command, String desc) {
        System.out.printf("%s\t%s\n", command, desc);
    }

    // prints the menu
    public static void printMenu() {
        printMenuLine();
        System.out.println("Chavvi Calc - Calculator Menu");
        printMenuLine();
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

}
