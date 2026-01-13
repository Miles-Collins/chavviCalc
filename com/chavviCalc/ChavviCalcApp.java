package com.chavviCalc;

import java.util.*;

/*
 * chavvi calc calculator
 */
public class ChavviCalcApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view, scan);

        controller.start();

        scan.close();
    }

}
