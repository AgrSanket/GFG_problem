//Nuts and Bolts Problem

/*
Given a set of n nuts & bolts. There is a one-on-one mapping between nuts and bolts. You have to Match nuts and bolts efficiently. 
Comparison of a nut to another nut or a bolt to another bolt is not allowed. It means the nut can only be compared with the bolt 
and the bolt can only be compared with the nut to see which one is bigger/smaller.
The elements should follow the following order: { !,#,$,%,&,*,?,@,^ }

Note: Make all the required changes directly in the given arrays, output will be handled by the driver code.
*/

//code:
class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        int hash[] = new int [256];
        for(int i = 0;i < n;i++){
            hash[nuts[i]]++;
        }
        
        int j = 0;
        for(int i = 0;i < 256;i++){
            while(hash[i] != 0){
                nuts[j] = (char)i;
                hash[i]--;
                j++;
            }
        }
        for(int i = 0;i < n;i++){
            bolts[i] = nuts[i];
        }

    }
}
