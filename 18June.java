//Number of Rectangles in a Circle

/*
Given a circular sheet of radius, r. Find the total number of rectangles with integral length and width
that can be cut from the sheet that can fit on the circle, one at a time.
*/
//code:
class Solution {
    int rectanglesInCircle(int r) {
        int count = 0;
        int dia = 2 * r;
        for(int i = 1; i < dia; i++){
            for(int j = 1; j < dia; j++){
                if(Math.pow(i,2) + Math.pow(j, 2) <= Math.pow(dia, 2)){
                    count++;
                }
            }
        }
        return count;
    }
};
