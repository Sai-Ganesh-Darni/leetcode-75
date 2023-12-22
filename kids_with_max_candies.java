import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        //Initially we calculate the maximum among the candies
        for(int i:candies){
            max = Math.max(max,i);
        }
        List<Boolean> res = new ArrayList<>();//holds the result
        for(int i:candies){
            //Checks whether the current candy can be made the maximum by adding extraCandies
            if(i+extraCandies>=max){
                res.add(true);
            }
            else
                res.add(false);
        }
        return res;
    }
}