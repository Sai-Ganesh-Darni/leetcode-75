class Solution {
    //If we can multiply  left part and right part of a number we can get the product of all the numbers except self
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int res[] = new int[len]; 
        int prev = 1;// here prev maintains the left part product
        for(int i=0;i<len;i++){
            res[i] = prev; //Here we store the left part product of each element
            prev *= nums[i];
        }        
        prev = 1; //here the prev maintains the right part product
        for(int i=len-1;i>=0;i--){
            res[i] *= prev; //Here we product the left part product with prev which contains the right part product
            prev *= nums[i];
        }
        return res;
    }
}