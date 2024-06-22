//Extract the Number from the String

/*
Given a sentence containing several words and numbers. Find the largest number among them which
does not contain 9. If no such number exists, return -1.

Note: Numbers and words are separated by spaces only. It is guaranteed that there are no leading zeroes in the answer.

//Code

class Solution {
    long ExtractNumber(String sentence) {
          String arr[]=sentence.split(" ");
        long ans=-1;
        for(int i=0;i<arr.length;i++){
         char c=arr[i].charAt(0);
            if(Character.isDigit(c)){
               boolean flag=check(arr[i]);
                if(flag){
                    ans=Math.max(ans,Long.parseLong(arr[i]));
                   
                }
            }
        }
        return ans;
    }
    
    boolean check(String s){
        
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='9'){
                return false;
            }
        }
        return true;
    }
}
