class Solution {
    public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;// maintains smallest value 
        int secondSmallest = Integer.MAX_VALUE; // maintains second smallest value
        for(int i:nums){
            if(i<=smallest)
                smallest = i; 
            else if(i<=secondSmallest)
                secondSmallest = i;
            else
                return true;   //When an element which is greater than both the elements is visited         
        }
        return false;
    }
}