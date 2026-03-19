/**
 * THE SIEVE OF ERATOSTHENES
 * -------------------------
 * Logic: "Don't Check, Just Strike."
 * Instead of checking if each number is prime, we mark out multiples of primes.
 * 
 * THE STEPS:
 * 1. Create a boolean array 'isPrime' of size (n+1).
 * 2. Assume all are prime (Arrays.fill(isPrime, true)).
 * 3. Set isPrime[0] and isPrime[1] to false.
 * 4. Loop i from 2 to sqrt(n):
 *    - If isPrime[i] is true, it's a prime! 
 *    - Now, start a nested loop from j = i*i to n, jumping by 'i'.
 *    - Set isPrime[j] = false (These are multiples, so they aren't prime).
 * 
 * WHY START AT i*i?
 * Because smaller multiples (like 2i, 3i) were already marked by 2 and 3!
 * 
 * COMPLEXITY: 
 * Time: O(N log log N) - Nearly Linear!
 * Space: O(N) - To store the boolean array.
 */




import java.util.*;

/**
 * THE SIEVE OF ERATOSTHENES
 * -------------------------
 * Logic: "Don't Check, Just Strike."
 * Time: O(N log log N) | Space: O(N)
 */
public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        // Calling the implementation
        countPrimes(n);
        
        sc.close();
    }

    /**
     * Implementation: Mark out multiples of primes.
     */
    public static void countPrimes(int n) {
        if (n <= 1) {
            System.out.println("No primes in this range.");
            return;
        }

        // 1. Create boolean array
        boolean[] isPrime = new boolean[n + 1];

        // 2. Assume all are prime
        Arrays.fill(isPrime, true);

        // 3. 0 and 1 are not prime
        isPrime[0] = false;
        isPrime[1] = false;

        // 4. Sieve Engine
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 5. Result
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }
        System.out.println("Total Prime Count up to " + n + ": " + count);
    }
}

