//Find maximum volume of a cuboid

/*
You are given a perimeter & the area. Your task is to return the maximum volume that can be made in the form of a cuboid from the given perimeter and surface area.
Note: Round off to 2 decimal places and for the given parameters, it is guaranteed that an answer always exists.
*/
//Code:
class Solution {

    double maxVolume(double perimeter, double area) {
        // code here
    double length = ((perimeter)-(Math.sqrt((perimeter*perimeter)-24*area)))/12.0;
        double volume = (length*length*((perimeter/4.0)-2*length));
        return Math.round(volume * 100.0) / 100.0;
    }
}
