//Count numbers containing 4

/*
You are given a number n, Return the count of total numbers from 1 to n containing 4 as a digit.
*/

//code
class Solution {
    public static int countNumberswith4(int n) {
        int count=0;
        for(int i=0;i<=n;i++){
            if(String.valueOf(i).contains("4")){
                count++;
            }
        }// code here
        return count;
    }
}
