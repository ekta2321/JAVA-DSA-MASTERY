/**
 * Problem: Count Perfect Squares less than n.
 * Time Complexity: O(1) - Constant time.
 * Space Complexity: O(1) - Constant space.
 */
class Solution {
    static int countSquares(int n) {
        // The number of perfect squares less than n is 
        // the integer part of the square root of (n-1).
        if (n <= 1) return 0;
        
        int result = (int) Math.sqrt(n - 1);
        return result;
    }
}
