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
                handleFirstValueInput();
                break;
            case 'b':
                handleSecondValueInput();
                break;
            case '+':
                handleAddition();
                break;
            case '-':
                handleSubtraction();
                break;
            case '*':
                handleMultiplication();
                break;
            case '/':
                handleDivision();
                break;
            case 'c':
                handleClear();
                break;
            case 'q':
                view.printQuitMessage();
                break;
            default:
                view.printError("Unknown command");
        }
    }

    private void handleFirstValueInput() {
        view.printPrompt("Enter a number for A: ");
        double value = getNumber();
        if (!Double.isNaN(value)) {
            model.setA(value);
        }
    }

    private void handleSecondValueInput() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleSecondValueInput'");
    }

    private void handleAddition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleAddition'");
    }

    private void handleSubtraction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleSubtraction'");
    }

    private void handleMultiplication() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleMultiplication'");
    }

    private void handleDivision() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleDivision'");
    }

    private void handleClear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleClear'");
    }

    private double getNumber() {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            view.printError("Invalid number format");
            return Double.NaN;
        }
    }

}
