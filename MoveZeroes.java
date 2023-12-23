class Solution {
    public void moveZeroes(int[] nums) {
      int zeroBlockSize=0; //Maintains the size of the block of zeroes
      for(int i=0;i<nums.length;i++){
          if(nums[i]==0)
            zeroBlockSize++; //If the element is zero then increment the zeroBlockSize
          else if(zeroBlockSize>0){
              int leftZero = i-zeroBlockSize; //leftZero maintains the position of the first zero in the block
              int temp = nums[i]; //Swap the current element with the first zero in the block
              nums[i] = nums[leftZero];
              nums[leftZero] = temp; 
          }
      }
    }
}