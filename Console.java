/**
 * Abstract base class containing console device, store and sales information.
 * Implements the required IConsoles interface.
 */
public abstract class Console implements IConsoles {
    private String consoleType;
    private String store;
    private int totalSales;

    /**
     * Constructs a Console object using the supplied values.
     */
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
