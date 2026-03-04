import java.util.Scanner;

/**
 * Foundation Practice: Basic Math & Formatting
 * Goal: Convert Celsius to Fahrenheit and format to 2 decimal places.
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Formula: (Celsius * 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Output formatted to 2 decimal places
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);

        sc.close(); // Best practice: always close the scanner
    }
}
