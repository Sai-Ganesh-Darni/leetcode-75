import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        /*
         * In this approach we use single HashMap for finding the difference
         * We store elements array with three values
         * 
         *    Value         Indicates
         *      0        Element is present only in nums1
         *     -1        Element is present only in nums2
         *      2        Element is present in both nums1 and nums2
         */
        for (int i : nums1) {
            map.put(i, 0); // Initially we assume all the elements are present only in nums1 and add it
                           // with value 0
        }
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) == 0)
                map.put(i, 2); // If the element is present in both arrays we change the value to 2
            if (!map.containsKey(i))
                map.put(i, -1); // If the element is present only in nums2 we add it with value -1
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (int i : map.keySet()) {
            if (map.get(i) == 0)
                result.get(0).add(i);
            else if (map.get(i) == -1)
                result.get(1).add(i);
        }
        return result;
    }
}