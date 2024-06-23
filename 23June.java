//Print Bracket Number
/*
Given a string str, the task is to find the bracket numbers, i.e., for each bracket in str, return i if the bracket is the ith opening or closing bracket to appear in the string. 
*/

//code
class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
            ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int counter = 1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(counter);
                result.add(counter);
                counter++;
            } else if (ch == ')') {
                result.add(stack.pop());
            }
        }

        return result;
    }
};
