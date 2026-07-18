//https://www.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n4404/1

class Solution {
    public int prime_Sum(int n) {
        // code here
        int sum = 0;
        for(int i = 2; i<= n ; i++){
        boolean ans = isPrime(i);
        
        if(ans == true){
            sum = sum + i;
        }
        }
        return sum;
        
        
    }
    boolean isPrime(int n){
        for(int i = 2; i*i<=n ; i++){
            if(n %i == 0){
                return false;
            }
            
        }
        return true;
    }

}
