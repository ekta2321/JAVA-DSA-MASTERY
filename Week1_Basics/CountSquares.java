//https://www.geeksforgeeks.org/problems/count-squares3649/1

//Time COMPLEXITY :--    O(sqrt(n))

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





//More Optimised Elite 
//time complexity O(n)
class Solution {
    static int countSquares(int n) {
        // code here
        return (int) Math.sqrt(n-1);
        
    }
}



