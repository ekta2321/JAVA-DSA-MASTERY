https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1



class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int ogN = n;
        int count =0;
        while(n>0){
            int d = n% 10;
            count = count + (d*d*d);
            n = n/10;
           
                
            
            
            
            
        } if(count == ogN){
                return true;
            }
        
        return false;
        
        
    }
}
