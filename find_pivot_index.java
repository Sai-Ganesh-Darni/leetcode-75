class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        int psum=0;
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
            if(psum==sum)
                return i;
            sum-=nums[i];
        }
        return -1;
    }
}