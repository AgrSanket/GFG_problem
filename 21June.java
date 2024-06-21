//Compare two fractions
/*
You are given a string str containing two fractions a/b and c/d, compare them and return the greater. If they are equal, then return "equal".

Note: The string str contains "a/b, c/d"(fractions are separated by comma(,) & space( )). 
*/

//code
class Solution {
    String compareFrac(String str) {
        String a = str.substring(0, str.indexOf("/"));
        String b = str.substring(str.indexOf("/") + 1, str.indexOf(","));
        String c = str.substring(str.indexOf(",") + 2, str.indexOf("/", str.indexOf(",") + 2));
        String d = str.substring(str.indexOf("/", str.indexOf(",") + 2) + 1);
        double k = Integer.valueOf(a) / (double) Integer.valueOf(b);
        double m = Integer.valueOf(c) / (double) Integer.valueOf(d);
        
        String ans = (k > m) ? (a + "/" + b) : (k < m) ? (c + "/" + d) : "equal";
         return ans;
    }
}
