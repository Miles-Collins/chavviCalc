package com.chavviCalc;

import java.util.Scanner;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;
    private Scanner scanner;

    public CalculatorController(CalculatorModel model, CalculatorView view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }

    public void start() {
        Character command = '_';

        // loop until user quits
        while (command != 'q') {
            view.printMenu();
            System.out.print("Enter a command: ");
            command = getCommand();
            executeCommand(command);
        }
    }

    private Character getCommand() {
        Character command = '_';
        String rawInput = scanner.nextLine();

        if (rawInput.length() > 0) {
            rawInput = rawInput.toLowerCase();
            command = rawInput.charAt(0);
        }

        return command;
    }

    private void executeCommand(Character command) {
        switch (command) {
            case 'a':
                handleAddition();
                break;
            case 's':
                handleSubtraction();
                break;
            case 'm':
                handleMultiplication();
                break;
            case 'd':
                handleDivision();
                break;
            case 'c':
                handleClear();
                break;
            case 'q':
                view.displayQuitMessage();
                break;
            default:
                view.displayError("Unknown command");
        }
    }

}
