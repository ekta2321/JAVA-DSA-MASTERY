import java.util.Scanner;

/**
 * Foundation Practice: Conditional Logic & Test Case Handling
 * Goal: Categorize integers relative to the threshold of 7.
 */
public class SevenThresholdFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First input: Number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                if (sc.hasNextInt()) {
                    int n = sc.nextInt();

                    // Conditional Logic: O(1) per case
                    if (n > 7) {
                        System.out.println("UP");
                    } else if (n == 7) {
                        System.out.println("EQUAL");
                    } else {
                        System.out.println("DOWN");
                    }
                }
            }
        }
        sc.close(); 
    }
}
