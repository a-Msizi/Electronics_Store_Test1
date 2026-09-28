/**
 * Concrete subclass that extends the abstract Console class.
 */
public class ConsoleSales extends Console {

    /**
     * Constructs a ConsoleSales object with the required information.
     */
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    /**
     * Prints a report containing the console type, store and total sales.
     */
    public void printReport() {
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("====================");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
