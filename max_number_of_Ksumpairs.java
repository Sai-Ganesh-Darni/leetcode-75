import java.util.*;
//Using Two Pointers
class Solution_1{
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); //Sort the array
        int count =0; //Maintains the count of pairs
        int l = 0,r = nums.length-1; //l and r are the two pointers
        while(l<r)
        {
            int sum = nums[l]+nums[r]; //sum is the sum of the two pointers
            if(sum==k){
                //If sum is equal to k then we increment the count and move both the pointers to left and right respectively since we should not use the same element twice
                count++;
                l++;
                r--;
            }
            else if(sum<k){
                //If sum is less than k then we move the left pointer to right
                l++;
            }
            else{
                //If sum is greater than k then we move the right pointer to left
                r--;
            }
        }
        return count; //return the count
    }
}

//Using HashMap
class Solution_2{
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>(); //map is the hashmap which stores the elements of the array and their count
        int count=0; //Maintains the count of pairs
        for(int i:nums)
        {
            int key = k-i; //key is the difference between k and the current element which is the other element of the pair
            if(map.containsKey(key)){
                map.put(key,map.get(key)-1); //If the key is present in the map then we decrement the count of the key
                count++; //Increment the count
                if(map.get(key)==0){
                    map.remove(key); //If the count of the key is zero then we remove the key from the map
                }
            }
            else 
                map.put(i,map.getOrDefault(i,0)+1); //If the key is not present in the map then only we add the i to the map. Because the same element should not be used twice
        }
        return count;
    }
}