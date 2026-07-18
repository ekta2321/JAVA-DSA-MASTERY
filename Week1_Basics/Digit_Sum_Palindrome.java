//https://www.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        int rev = 0;
        
        while(n>0){
            int a = n%10;
            sum = sum + a;
            n = n/10;
        }
        int tsum = sum;
        while(tsum>0){
            int b = tsum %10;
            rev = (rev * 10)+b;
            tsum = tsum/10;
        
        }
        if(rev == sum){
        return true;
        }
        return false;
    }
}
