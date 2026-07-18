//https://www.geeksforgeeks.org/problems/reversing-the-equation2205/1

class Solution {

    String reverseEqn(String S) {
        // your code here
       
        String currNo = "";
        String finalans =  "";
        for(int i = 0 ; i <S.length() ; i++){
            char ch = S.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch =='/'){
                finalans = ch + currNo + finalans;
                currNo="";
            }else{
                currNo += ch;
            }
        }
        
        finalans =  currNo + finalans;
        return finalans;
    
        
    }
}
