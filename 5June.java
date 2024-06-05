//Swapping pairs make sum equal

/*
Given two arrays of integers a[] and b[] of size n and m, the task is to check if a pair of 
values (one value from each array) exists such that swapping the elements of the pair will 
make the sum of two arrays equal.

Note: Return 1 if there exists any such pair otherwise return -1.
*/

//code :

class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        Set<Long> set = new HashSet<>();
        
        long aSum = Arrays.stream(a).sum();
        long bSum = Arrays.stream(b).sum();
        long diff = Math.abs(aSum - bSum);
        if(diff == 0)
            return 1;
        if((aSum + bSum) % 2 == 1)
            return -1;
        
       for(int i = 0 ; i < a.length ; i++)
           set.add(a[i]);
       
       for(int i = 0 ; i < b.length ; i++){
           if(set.contains(diff-b[i]))
            return 1;
       }
        return -1;
    }
}
