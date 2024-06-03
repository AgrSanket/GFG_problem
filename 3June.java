//Trail of ones

/* 
Given a number n, find the number of binary strings of length n that contain consecutive 1's in them.
Since the number can be very large, return the answer after modulo with 1e9+7.
*/

//code :
class Solution {
    static int numberOfConsecutiveOnes(int n) {
        int MOD=(int)Math.pow(10,9)+7;
        long ans=1;
        int x=0,y=1;
        for(int i=3;i<=n;i++){
            ans=(ans*2+x+y)%MOD;
            x=x%MOD;
            y=y%MOD;
            int temp=x;
            x=y;
            y=y+temp;
        }
        return (int)ans;
    }
}

//Time Complexity: O(n)
//Auxiliary Space: O(n)
