import java.util.*;

public class CheckPrimes {
    public static void main(String[] args) {
        /* Facts about Prime
        1:- 2 is the only even prime no.
        2:- Every prime number can be written as 6n+1 or 6n-1 (Except 2&3). 
            Note: All primes > 3 follow this, but not all 6n±1 are prime (e.g. 25).
        3:- 2 and 3 are the only consecutive prime numbers.
        4:- Goldbach conjecture :- 
            Every even integer > 2 can be expressed as a sum of two prime nos: 
            (Eg: 18 = 11 + 7 or 13 + 5. Note: 18 = 7 + 2 is NOT 18!)
        5:- WILSON'S THEOREM: 'p' is prime IF ((p-1)! + 1) % p == 0. 
            (Great for theory, bad for code due to Factorial Overflow).
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // 1. Primality Check
        checkIfPrime(n);

        // 2. Sum of Factors
        sumOfFactors(n);

        // 3. Product of Three Distinct Numbers
        prodOfN(n);

        sc.close();
    }

    /**
     * OPTIMISED SOLUTION: O(sqrt(n))
     * We go till sqrt because factors repeat after the midway point.
     * We use i*i <= n to avoid Math.sqrt() which can be slow on some servers.
     */
    public static void checkIfPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not prime.");
            return;
        }
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++; // First factor found
                if ((n / i) != i) {
                    count++; // Partner factor found (if not the same)
                }
            }
        }
        if (count == 2) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    /**
     * LOGIC: Use the "Partner Rule" to add both (i) and (n/i) in one step.
     * This ensures O(sqrt(n)) efficiency.
     */
    public static void sumOfFactors(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if ((n / i) != i) {
                    sum += n / i;
                }
            }
        }
        System.out.println(sum + " is the sum of all factors of " + n);
    }

    /**
     * *************** Product of Three Numbers ***************
     * Greedy Approach: Take the smallest distinct 'a', then smallest 'b'.
     */
    public static void prodOfN(int n) {
        int originalN = n;
        int a = 1, b = 1, c = 1;

        // Step 1: Find smallest 'a' starting from 2
        for (int i = 2; i * i * i <= n; i++) {
            if (n % i == 0) {
                a = i;
                n /= a; // Squeeze out 'a'
                break;
            }
        }

        // STEP 2: Find the smallest divisor 'b' of the NEW 'n'.
        // We start from (a + 1) to GUARANTEE that 'b' is strictly greater than 'a'.
        for (int i = a + 1; i * i <= n; i++) {
            if (n % i == 0) {
                b = i;
                n /= b; // Squeeze out 'b'
                break;
            }
        }

        // Step 3: The leftover is 'c'
        c = n;

        // Final Validation: Ensure a, b, c are distinct and none are 1
        if (a != b && b != c && a != c && c > 1 && b > 1 && a > 1) {
            System.out.println("Distinct triplet of " + originalN + " is: " + a + " " + b + " " + c);
        } else {
            System.out.println("Distinct triplet of " + originalN + " is not found");
        }
    }
}
