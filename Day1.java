//Swap two nibbles in a byte
/*
Given a number n, Your task is to swap the two nibbles and find the resulting number. 
A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte. 
For example, the decimal number 150 is represented as 10010110 in an 8-bit byte. 
This byte can be divided into two nibbles: 1001 and 0110.
*/
// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        int rightShifted = n >> 4;
        int leftShifted = (n & 0x0F) << 4;
        return rightShifted | leftShifted;
    }
}
