
public class ChavviCalcView {

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
        System.out.println("ChavviCalc");
        printMenuLine();

        printMenuCommand('q', "Quit");

        printMenuLine();
    }

}
