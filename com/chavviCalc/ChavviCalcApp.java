package com.chavviCalc;

import java.util.*;

/*
 * chavvi calc calculator
 */
public class ChavviCalcApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ChavviCalcModel model = new ChavviCalcModel();
        ChavviCalcView view = new ChavviCalcView();
        ChavviCalcController controller = new CalcController(model, view, scan);

        controller.start();

    }

}
