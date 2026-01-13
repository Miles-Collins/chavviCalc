
import java.util.Scanner;

public class ChavviCalcController {

    private ChavviCalcModel model;
    private ChavviCalcView view;
    private Scanner scanner;

    public CalculatorController(ChavviCalcModel model, ChavviCalcView view, Scanner scanner) {
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
            command = menuGetCommand(scan);

            executeCommand(scan, command);
        }

        scanner.close();
    }

}
