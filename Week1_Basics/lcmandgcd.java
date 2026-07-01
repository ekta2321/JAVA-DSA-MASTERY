//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1


class Solution {
  public static int[] lcmAndGcd(int a, int b) {
        // code here
        int ogA =a ;
        int ogB = b;
        while(a>0 && b>0){
            if(a>b){
               a = a%b;
            }else{
                b = b % a ;
            }
            
        }
        int gcd;
        if(a == 0){
            gcd = b;
            
        }else{
            gcd = a;
            
        }
        
        int lcm = (ogA / gcd) * ogB;
        
        return new  int[]{lcm,gcd};
        
        
        
    }
}
