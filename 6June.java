// Max sum in the configuration
/*
Given an integer array(0-based indexing) a of size n. Your task is to return the maximum 
  value of the sum of i*a[i] for all 0<= i <=n-1, where a[i] is the element at index i in
  the array. The only operation allowed is to rotate(clockwise or counterclockwise) the 
  array any number of times.
*/

//Code:
class Solution {
    long max_sum(int a[], int n) {
        long sum = 0;
        for (int i =0; i<n ; i++){
            sum +=a[i];
        }
        long currSum = 0;
        for(int i =0; i<n;i++){
            currSum += (long)i *a[i];
        }
        long maxn = currSum;
        for(int i =1;i<n;i++){
            currSum = currSum + sum-(long)n*a[n-i];
            maxn = Math.max(maxn, currSum);
        }
        return maxn;
    }
}
