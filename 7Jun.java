//Maximum occured integer

/*
Given n integer ranges, the task is to return the maximum occurring integer in the given ranges. If more than one such integer exists, return the smallest one.
The ranges are in two arrays l[] and r[].  l[i] consists of the starting point of the range and r[i] consists of the corresponding endpoint of the range & a maxx which is the maximum value of r[].

For example, consider the following ranges.
l[] = {2, 1, 3}, r[] = {5, 3, 9)
Ranges represented by the above arrays are.
[2, 5] = {2, 3, 4, 5}
[1, 3] = {1, 2, 3}
[3, 9] = {3, 4, 5, 6, 7, 8, 9}
The maximum occurred integer in these ranges is 3.
*/

//code:
class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
         int a[]=new int[maxx+2];
        
        for(int i=0;i<n;i++)
        {
            a[l[i]]++;
            a[r[i]+1]--;
        }
        
        for(int i=1;i<=maxx;i++)
        {
           a[i]+=a[i-1]; 
        }
        
        int max=-1;
        int maxsum=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>maxsum)
            {
                maxsum=a[i];
                max=i;
            }
        }
        return max;
    }
}
