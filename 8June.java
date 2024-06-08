//Index of an Extra Element

/*
Solve today's problem-> Be the comment of the day-> Win a GfG T-Shirt!
Daily rewards up for grabs!

banner
You have given two sorted arrays arr1[] & arr2[] of distinct elements. The first array has one element extra added in between. Return the index of the extra element.

Note: 0-based indexing is followed.
*/

//code:
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        for(int i=0;i<n-1;i++){
            if(arr1[i]!=arr2[i]){
                return i;
            }
        }
        return n-1;
    }
}
