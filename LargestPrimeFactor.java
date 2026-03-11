/**
 * Problem: Largest Prime Factor
 * Concept: Optimized Prime Factorization using Square Root
 * Time Complexity: O(sqrt(N))
 * Space Complexity: O(1)
 */
class Solution {
    static long largestPrimeFactor(int n) {
        long maxPrime = -1;
        long num = (long) n;

        // Step 1: Remove all factors of 2 (The Even Sieve)
        while (num % 2 == 0) {
            maxPrime = 2;
            num /= 2;
        }

        // Step 2: Check for odd factors from 3 to sqrt(N)
        for (long i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                maxPrime = i;
                num /= i;
            }
        }

        // Step 3: If num is still > 2, the leftover is the largest prime
        if (num > 2) {
            maxPrime = num;
        }

        return maxPrime;
    }
}
