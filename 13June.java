//Padovan Sequence

/*
Given a number n, find the nth number in the Padovan Sequence.

A Padovan Sequence is a sequence which is represented by the following recurrence relation
P(n) = P(n-2) + P(n-3)
P(0) = P(1) = P(2) = 1

Note: Since the output may be too large, compute the answer modulo 10^9+7.
*/

//code
class Solution
{
    int mod = 1000000000+7;
  public int padovanSequence(int n){
      int[] arr = new int[n + 3]; 
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
     
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 2]%mod + arr[i - 3]%mod)%mod;
        }
     
    return arr[n];
       
  }
    
}
