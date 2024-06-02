//Construct list using given q XOR queries

/*Given a list s that initially contains only a single value 0. There will be q queries of the following types:

0 x: Insert x in the list
1 x: For every element a in s, replace it with a ^ x. ('^' denotes the bitwise XOR operator)
Return the sorted list after performing the given q queries.*/

//code

class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0); // Initial list containing just one element: 0
        int cumulativeXOR = 0; // To keep track of the cumulative XOR
        
        for (int i = 0; i < q; i++) {
            if (queries[i][0] == 0) {
                // Add the element to the list, adjusted by the cumulative XOR
                ans.add(queries[i][1] ^ cumulativeXOR);
            } else if (queries[i][0] == 1) {
                // Update the cumulative XOR
                cumulativeXOR ^= queries[i][1];
            }
        }
        
        // Apply the cumulative XOR to all elements before sorting
        for (int i = 0; i < ans.size(); i++) {
            ans.set(i, ans.get(i) ^ cumulativeXOR);
        }
        
        // Sort the list before returning
        Collections.sort(ans);
        return ans;
    }
}
