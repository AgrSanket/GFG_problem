//Prime Pair with Target Sum

/*
Given a number n, find out if n can be expressed as a+b, where both a and b are prime numbers. If such a pair exists,
return the values of a and b, otherwise return [-1,-1] as an array of size 2.

Note: If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, and a < c then  [a, b] is 
considered as our answer.
*/

//code 

class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
    boolean[] prime = new boolean[n + 1];
        for(int i = 2; i<=n; ++i){
            prime[i] = true;
        }
        
        for(int i = 2; i * i <= n; ++i){
            if(prime[i]){
                for(int j = i * i; j<= n; j += i){
                    prime[j] = false;
                }
            }
        }
        
        
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 2; i <= n; ++i){
            if(prime[i] && prime[n - i]){
                res.add(i);
                res.add(n - i);
                return res;
            }
        }
        
            res.add(-1);
            res.add(-1);
        
        return res;
    }
}
