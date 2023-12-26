// Using Prefix Sum
class Solution {
    public int largestAltitude(int[] gain) {
        int height = 0; //Maintains the current height of biker
        int maxHeight = 0; //Max altitude of biker so far
        for(int i:gain) 
        {
            height+=i; //Updating height based on the encountered gain
            maxHeight = Math.max(height,maxHeight); //Updating the max altitude
        }
        return maxHeight;
    }
}