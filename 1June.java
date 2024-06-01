//Odd Even Problem

/*
Given a string s of lowercase English characters, determine whether the summation of x and y is EVEN or ODD.
where:

1. x is the count of distinct characters that occupy even positions in the English alphabet and have even frequency. 
2. y is the count of distinct characters that occupy odd positions in the English alphabet and have odd frequency.
Ex: string = "ab" here 'a' has an odd(1) position in the English alphabet & has an odd(1) frequency in the string so a is odd but b has an even(2) position in the English alphabet & has odd(1) frequency so it doesn't count(since string doesn't have 2 b's) so the final answer x + y = 1+0 = 1(odd) would be "ODD".

Note: Return "EVEN" if the sum of x & y is even otherwise return "ODD".
  */

//code:
class Solution {
    public static String oddEven(String s) {
        int x=0,y=0;
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) { 
            
            int frequency = hash[i];   
            
                if (frequency > 0) {
                if ((i+1) % 2 == 0 && frequency % 2 == 0) {
                    x++;
                }
                else if ((i+1) % 2 != 0 && frequency % 2 != 0) {
                    y++;
                }
            }
        }
        if((x+y)%2 == 0){   // return statements
            return "EVEN";  
        } else {
            return "ODD";
        }
    }
}
