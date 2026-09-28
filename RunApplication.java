import java.util.Scanner;

/**
 * Main application for Question 2.
 * Allows the user to select a console type and enter store sales information.
 */
public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Enter your choice: ");
        int choice = readChoice(input);

        String consoleType = getConsoleType(choice);

        System.out.print("Enter the store: ");
        String store = input.nextLine().trim();
        while (store.isEmpty()) {
            System.out.print("Store name cannot be empty. Enter the store: ");
            store = input.nextLine().trim();
        }

        System.out.print("Enter the total amount of sales for " + consoleType +
                " for " + store + ": ");
        int totalSales = readNonNegativeInt(input);

        ConsoleSales consoleSales = new ConsoleSales(consoleType, store, totalSales);
        consoleSales.printReport();

        input.close();
    }

    /** Reads a valid console menu choice. */
    private static int readChoice(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.print("Invalid choice. Enter 1, 2 or 3: ");
            input.next();
        }

        int choice = input.nextInt();
        input.nextLine(); // Consume the newline.

        while (choice < 1 || choice > 3) {
            System.out.print("Invalid choice. Enter 1, 2 or 3: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid choice. Enter 1, 2 or 3: ");
                input.next();
            }
            choice = input.nextInt();
            input.nextLine();
        }
        return choice;
    }

    /** Converts the numeric menu choice into the required console name. */
    private static String getConsoleType(int choice) {
        switch (choice) {
            case 1:
                return "PS5";
            case 2:
                return "XBOX";
            default:
                return "SWITCH";
        }
    }

    /** Reads a non-negative integer for total sales. */
    private static int readNonNegativeInt(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.print("Invalid amount. Enter a non-negative whole number: ");
            input.next();
        }

        int amount = input.nextInt();
        while (amount < 0) {
            System.out.print("Amount cannot be negative. Enter a non-negative whole number: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid amount. Enter a non-negative whole number: ");
                input.next();
            }
            amount = input.nextInt();
        }
        return amount;
    }
}
