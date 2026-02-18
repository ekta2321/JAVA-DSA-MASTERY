public class Foundation_Basics_25{
    public static void main(String[] args){
        //PRACTICE QUESTION
        //WORK AT TECH BASIC 

        // Scanner sc = new Scanner(System.in);
        // double weight =0;
        // for(int i =0 ; i<= 10; i++){
        //    weight = weight + sc.nextDouble();
           

        // }
        // double avg = weight/ 10.0f;
        // System.out.print(avg);
        




        //*************1--EVEN OR ODD**************

        // Scanner sc = new Scanner(System.in);
        // System.out.println("How many numbers: ");
        // int n = sc.nextInt();
        // int num = 0;
        // for(int i = 0; i<= n ; i++){
        //     num = sc.nextInt();
        //     if(num % 2 == 0){
        //         System.out.println("Even");
        //     }else{
        //         System.out.println("odd");
        //     }
        // }

        //*********Print 2 nos. indi**********

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int no = 0;

        // for(int i = 0 ; i<n ; i++){
        //     no = 0 + sc.nextInt();
           

        //     int firstdigit = no /10;
        //     int lastdigit = no % 10;
        //     System.out.println(firstdigit + " " + lastdigit);

        // }

        //******************3--Divide by 6*******************
        // Scanner sc = new Scanner (System.in);
        // int t = sc.nextInt();

        // int n = 0 ;
        // for(int i = 0 ; i<t; i++){
        //     n = 0 + sc.nextInt();
        //     if(n % 6 == 0){
        //         System.out.println("True");
        //     }else{
        //         System.out.println("False");
        //     }


        // }

        //*****************4--temp conversion********************
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();

        // double temprature = 0 ;
        // double temprf = 0;
        // for(int i = 0 ; i<t; i++){
        //     temprature = sc.nextDouble();
        //     temprf = ((9 * temprature) /5) + 32;
        // }
        
        // System.out.printf("%.2f\n"  , temprf);


    //********************5--7 up and down**********************
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();

    //     int n = 0 ;

    //     for(int i =0 ; i< t ;i ++){
    //         n = sc.nextInt();
    //         if(n>7){
    //             System.out.println("UP");
    //         }else if(n == 7){
    //             System.out.println("EQUAL");

    //         }else{
    //             System.out.println("DOWN");
    //         }
    //     }

    //******************6 -- Traingle*******************
    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();

    // int side1 = 0;
    // int side2 = 0;
    // int side3 = 0;
    

    // for(int i = 0 ; i<t; i++){
    //     side1 = sc.nextInt();
    //     side2 = sc.nextInt();
    //     side3 = sc.nextInt();

    //     if((side1 + side2 >= side3) && (side2 + side3 >= side1) && (side1 + side3 >= side2) ){
    //         int circum = side1 + side2 +side3;
    //         System.out.println(circum);
    //     }else{
    //         System.out.println("-1");
    //     }
    // }


    //************* 7 -- Reverse a number**************************** 
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int lastdigit = 0 ;
    // int temp = 0;
    
    // int rev = 0;


    // while(n > 0){
    //     lastdigit = n %10;
       
    //     rev = rev * 10 + lastdigit;
    //     n = n/10;
        
    // }
    // System.out.println(rev);
    
    //***********************8 -- Sum of the digits**********************
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // int lastdigit =0;
    // int sum =0;
    

    // while(n > 0){
    //     lastdigit = n% 10;
    //     sum  = sum + lastdigit;
    //     n = n/10;
    // }

    // System.out.println(sum);


   //*********** 9 -- Add one***********************
//    Scanner sc = new Scanner(System.in);
//    String name = sc.next();

//    int n = sc.nextInt();
//    int age  = n+1;
//    System.out.println("Hello" + " " + name + "!" + "Next year you will be" +  " "+  age + " " +"years old");


//*********** 10 -- Happy Birthday****************

// Scanner sc = new Scanner(System.in);
// String name = sc.next();
// int year = sc.nextInt();


// int age = 2020 - year;

// System.out.println("Happy Birthday"  + " " + name + " ! Your current age is" + " " + age);

//*********************** 11-- Palindrome *******************************

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int ld = 0;
// int rev = 0;
// int temp = n;


// while(n>0){
//     ld = n%10;
//     rev = rev  * 10 + ld;
//     n /= 10;
//    }
// if(rev == temp){
//     System.out.println("Palindrom");
//   }else{
//     System.out.println(" Not Palindrom");
//   }

//************* 12 --- one char***************** 

// Scanner sc = new Scanner(System.in);
// String word = sc.next();
// for(int i = 0 ; i<word.length(); i++){
//     System.out.println(word.charAt(i));
// }

//******************** 13 -- Armstrong******************** 

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int temp = n;
// int rev = 0;
// int ld = 0;

// while(n>0){
//     ld = n% 10;
//     rev = rev + (ld * ld * ld);
//     n = n/10;

// }
// if(rev == temp){
//     System.out.println("Armstong");
// }else{
//     System.out.println("Not a Armstong");

// }


 //************** 14 -- Reverse the order*******************
//  Scanner sc = new Scanner(System.in);
//  int n = sc.nextInt();
//  int[] arr = new int [n];

 
//  for(int i = 0 ; i<n; i++){
//     arr[i] = sc.nextInt();
//  }

//  for (int i = n - 1; i >= 0; i--) {
    
//     System.out.print(arr[i] + " ");

//  }
 
//********** 15 -- 2 character line**************** 
//  String str  = "WORKATTECH";
//  for(int i = 0 ; i <=str.length() ; i+=2){
//     char first = str.charAt(i);
//     char second = str.charAt(i+1);
//     System.out.println("" + first + second);
//  }




//************ 16 -- Word Palindrome***********

    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();
    // String word ;

    // for(int i =0 ; i<t; i++){
    //     word = sc.next();
    //     int start = 0 ;
    //     int end = word.length() - 1;
    //     boolean isPalindrome = true;
    //     while(start < end){
    //         if(word.charAt(start) !=  word.charAt(end)){
    //             isPalindrome = false;
    //             break;
    //         }
    //         start++;
    //         end--;
    //     }
    //     if(isPalindrome == true){
    //         System.out.println("TRUE");
    //     }else{
    //         System.out.println("FALSE");
    //     }
        
    // }
    

   //**************** 17  -- Multiplication table***************
//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//    long n;

//    for(int i = 0 ; i<t; i++){
//     n = sc.nextLong();
//     for(int j =1 ; j<= 10 ; j++){
//         long Multiplication = (int)(n  * j);
//         System.out.print("" + Multiplication + " ");

//     }
//     System.out.println();
//    }

//************ 18 --- Star Pattern 1*********************

// int n = 5;
// for(int i = 1 ; i<=n ; i++){
//     for(int j = 1 ; j <= i; j ++){
//         System.out.print("*");
//     }
//     System.out.println("");
// }



//************ 19 -- Star Pattern2******************
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for(int i = 1 ; i<=n ; i++){
//     for(int j = 1 ; j <= i; j ++){
//         System.out.print("*");
//     }
//     System.out.println("");
// }

//***************** 20 -- Fibonnaci numbers*******************
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int a = 0 ;
//    int b =1 ;
 

// for(int i = 0 ; i<n ; i++){

//     System.out.print(a + " ");
   
   
//     int temp = a + b;
//     a = b;
//     b = temp;
// }



//*************** 21 -- Pateries****************************
// Scanner sc = new Scanner(System.in);
// int pastries = sc.nextInt();
// int customers = sc.nextInt();
// int pwant = 0;
// for(int i = 0 ; i<customers; i ++){
//     pwant = sc.nextInt();
//     if(pastries >0){
//         System.out.println("Enjoy your dessert!");
//         int pleft = pastries - pwant;
//         pwant = pleft;
//     }if(pastries < 0){
//         pastries = 0; //edge cases

//     }
//         else{
//         System.out.println("Sorry, we are all out!");
//     }
// }


//******************* 22 -- High Fever covid****************************

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// String result = "";
// for(int i = 0 ; i<n ; i++){
//     String name = sc.next();
//     double temp = sc.nextDouble();
//     if(temp > 98.6d){
//         if(result.equals("")){
//             result = name;
//         }else{
//             result = result + ", " + name;
//         }
        
//     }
    
// }
// System.out.println(result);


//***************** 23 --- Guess*************************
// Scanner sc = new Scanner(System.in);
// int bd = sc.nextInt();
// int n ;
// String guess = "";
// while(true) {
//     n = sc.nextInt();
    
//     if(bd == n){
//         System.out.println("Correct");
//         break;
//     }else{
//         System.out.println("InCorrect");
//     }
    
// }


//******** 24 --- square of numbers*****************
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// int n;
// for(int i  = 0; i<t; i++){
//     n = sc.nextInt();
//     long square = n *n;
//     System.out.println(square);

// }






    }
}

    