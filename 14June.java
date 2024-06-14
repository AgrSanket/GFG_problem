//Armstrong Numbers
/*
You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371.

Note: Return "Yes" if it is an Armstrong number else return "No".
  */

//code
class Solution {
    static String armstrongNumber(int n){
        // code here
        int sum = 0;
        int q = n;
        int r = 0;
        
        while (n>0){
        r = n%10;
        sum += r*r*r;
        n = n/10;
        }
        if (sum == q){
            return  "Yes";
            
        }
        return "No";
    }
}
