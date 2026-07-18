//https://www.geeksforgeeks.org/problems/largest-prime-factor2601/1

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int maxPrime = -1;
        
        for(int i = 2; i*i <=n; i++){
            if(n%i==0){
                maxPrime =i;
                while(n%i == 0){
                    n /= i;
                }
            }
        }
        if(n>1){
        maxPrime = n;
        }
        return maxPrime;
    }
}
