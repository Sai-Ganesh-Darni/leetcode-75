class Solution {
    //Two Pointer Approach
    public int maxArea(int[] height) {
        int l = 0,r = height.length-1; //l and r are the two pointers
        int max=0;//max is the maximum area
        while(l<r)
        {
            int area = Math.abs((r-l)*Math.min(height[l],height[r])); //area is the area of the container formed by the two pointers
            max = Math.max(area,max); //max is the maximum area
            if(height[l]<height[r]){
                l++; //if height of left pointer is less than height of right pointer then we move left pointer to right
            }
            else if(height[l]>height[r]){
                r--; //if height of right pointer is less than height of left pointer then we move right pointer to left
            }
            else{ 
                //if height of both the pointers are equal then we move both the pointers to left and right respectively
                l++;
                r--;
            }
        }
        return max; //return the maximum area
    }
}