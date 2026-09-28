import java.util.Arrays;
import java.util.Scanner;

/**
 * Question 1: Gaming console sales report.
 * Demonstrates single-dimensional and two-dimensional arrays, row/column output,
 * totals for each city, and determination of the city with the most sales.
 */
public class GamingConsoleReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Single-dimensional arrays store the city and console names.
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: rows represent cities; columns represent consoles.
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Single-dimensional array for each city's total sales.
        int[] cityTotals = new int[sales.length];

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("======================");
        System.out.printf("%-18s%10s%10s%10s%n", "CITY", consoles[0], consoles[1], consoles[2]);

        int highestTotal = Integer.MIN_VALUE;
        int highestCityIndex = -1;

        for (int row = 0; row < sales.length; row++) {
            int total = 0;
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }
            cityTotals[row] = total;

            if (total > highestTotal) {
                highestTotal = total;
                highestCityIndex = row;
            }

            System.out.printf("%-18s%10d%10d%10d%n",
                    cities[row], sales[row][0], sales[row][1], sales[row][2]);
        }

        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("==================================");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i], cityTotals[i]);
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestCityIndex]);
        System.out.println("TOTAL SALES: " + highestTotal);

        // Demonstrates use of the single-dimensional arrays in the application.
        System.out.println("\nCities loaded: " + Arrays.toString(cities));
        System.out.println("Consoles loaded: " + Arrays.toString(consoles));

        input.close();
    }
}
