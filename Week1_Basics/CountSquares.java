//https://www.geeksforgeeks.org/problems/count-squares3649/1

class Solution {
    static int countSquares(int n) {
        // code here
        int count=0;
        for(int i = 1; i<Math.sqrt(n) ; i++){
            count++;
        }
        return count;
    }
}



