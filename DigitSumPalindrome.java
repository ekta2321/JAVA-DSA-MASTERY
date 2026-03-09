// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int temp = 0;
        while (n > 0){
            int ld = n%10;
            temp += ld;
            n  /= 10;
            
    
        }
        boolean result = isPalindrome(temp);
        if(result == true){
            return true;
        }
        return false;
        
    }
    
    boolean isPalindrome(int n){
        int rev = 0;
        int ogN = n;
        while(n>0){
            int ld = n%10;
            rev = (rev *10) + ld;
            n /= 10;
            
        }
        if(rev == ogN){
            return true;
        }
        return false;
    }
}
