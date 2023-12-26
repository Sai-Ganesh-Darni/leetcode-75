/*
Longest Subarray of 1's After Deleting One Element
Approach: using Sliding Window
TC: O(n)
SC: O(1)
*/
class Solution1 {
    public int longestSubarray(int[] nums) {
        int len = nums.length;
        if(len==1)
            return 0; // When length = 1, always the result is 0, Hence the length is 0 after deleting it.
        int l=0,r = 0,fl=0,maxLen=0; // l and r are two pointers which form a window, fl is used for flag to check whether the 0 is encountered
        while(l<len && r<len)
        {
            if(nums[r]==0){
                if(fl==0)
                    fl=1;
                else{
                    while(nums[l++]!=0); // To shift the window when another zero is encountered
                }
            }
            maxLen = Math.max(maxLen,r-l); // Storing the window size by deleting one element
            r++;
        }
        return maxLen;
    }
} 

/*
 * Using Prefixsum Appraoch
 * TC: O(n)
 * SC: O(n)
 */

class Solution2 {
    public int longestSubarray(int[] nums) {
        int len = nums.length;
        if(len==1)
            return 0;
        int leftToRight[] =  new int[len]; // Maintains the length of consecutive 1s on left side of each element 
        int rightToLeft[] = new int[len]; // Maintains the length of consecutive 1s on right side of each element 
        leftToRight[0] = nums[0]==0?0:1;
        for(int i=1;i<len;i++)
        {
            if(nums[i]==1){
                leftToRight[i]=leftToRight[i-1]+1;
            }
            else{
                leftToRight[i] = 0;
            }
        }
        rightToLeft[len-1] = nums[len-1]==0?0:1;
        for(int i=len-2;i>=0;i--)
        {
            if(nums[i]==1){
                rightToLeft[i] = rightToLeft[i+1]+1;
            }
            else{
                rightToLeft[i] = 0;
            }

        }
        int maxLen = 0;
        for(int i=0;i<len;i++){
            // We discard the current element, and add both side consecutive ones
            if(i==0)
                maxLen = rightToLeft[i+1];
            else if(i==len-1)
                maxLen = Math.max(maxLen,leftToRight[i-1]);
            else{
                maxLen = Math.max(maxLen,leftToRight[i-1]+rightToLeft[i+1]);
            }
        }
        return maxLen;
    }
}