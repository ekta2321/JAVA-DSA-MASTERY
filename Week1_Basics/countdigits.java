//https://www.geeksforgeeks.org/problems/count-digits5716/1

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int ogN = n;
        int count = 0;
        while(n>0){
            int d = n % 10;
            if(d != 0 && ogN%d == 0){
                count++;
                
            }
            n /=10;
            
            
        }
        return count;
    }
}
