import java.util.ArrayList;

/**
 * Foundation Practice: Dynamic Arrays & Loops
 * Goal: Generate a multiplication table using ArrayList<Integer>.
 */
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // ArrayList is used here for dynamic resizing
        ArrayList<Integer> table = new ArrayList<>();
        
        // Loop runs exactly 10 times: O(1) complexity relative to n
        for (int i = 1; i <= 10; i++) {
            table.add(n * i);
        }
        
        return table;
    }
}
