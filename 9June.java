//Convert array into Zig-Zag fashion

/*
Given an array arr of distinct elements of size n, the task is to rearrange the elements of the array in
a zig-zag fashion so that the converted array should be in the below form: 

arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 

Note: Modify the given arr[] only, If your transformation is correct, the output will be 1 else the output will be 0. 

*/

//code
class Solution {
    public static void zigZag(int n, int[] arr) {
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {               
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } 
               else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag;
        }
      }
    }
