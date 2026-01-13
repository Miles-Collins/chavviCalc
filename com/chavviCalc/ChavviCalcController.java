
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

    private static Character menuGetCommand(Scanner scan) {
        Character command = '_';

        String rawInput = scan.nextLine();

        if (rawInput.length() > 0) {
            rawInput = rawInput.toLowerCase();
            command = rawInput.charAt(0);
        }

        return command;
    }

    // calculator functions
    private static Boolean executeCommand(Scanner scan, Character command) {
        Boolean success = true;

        switch (command) {
            case 'q':
                System.out.println("Thank you for using Chavvi Calc");
                break;
            default:
                System.out.println("ERROR: Unknown commmand");
                success = false;
        }

        return success;
    }

}
