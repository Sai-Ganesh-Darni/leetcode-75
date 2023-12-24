// Problem: 1004. Max Consecutive Ones III
// Using Sliding Window
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount =0; //Stores the number of zeroes in the current window
        int l= 0,r = 0,len = nums.length; //l and r are the left and right pointers
        int maxCount=0; //Stores the maximum number of ones in a window
        while(r<len)
        {
            if(nums[r]==0){
                zeroCount++; //If the current element is 0, we increment zeroCount
                if(zeroCount>k){
                    //If the number of zeroes in the current window is greater than k, we move the left pointer to the next zero
                    while(nums[l++]!=0);
                }
            }
            maxCount = Math.max(maxCount,r-l+1); //We calculate the maximum number of ones in a window
            r++;
        }
        return maxCount;
    }
}