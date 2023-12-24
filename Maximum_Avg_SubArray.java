//Using Sliding Window
//Time complexity: O(n)
//Space complexity: O(1)
class Solution {    
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // Initially we calculate the sume of first k elements which will be first window
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int len = nums.length;
        int maxSum = sum;
        //Now we slide the window by adding the next element and removing the first element
        for(int i=k;i<len;i++){
            sum+=nums[i]-nums[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        //We return the maximum sum divided by k
        return maxSum/(double)k;
    }
}