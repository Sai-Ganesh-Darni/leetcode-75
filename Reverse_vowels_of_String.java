import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        int l =0,r = s.length()-1;
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char arr[] = s.toCharArray();
        while(l<r)
        {
           if(set.contains(arr[l]) && set.contains(arr[r])){
               char ch = arr[l];
               arr[l] = arr[r];
               arr[r] = ch;
               l++;
               r--;
           }
           if(!set.contains(arr[l])){
               l++;
           }
           if(!set.contains(arr[r])){
               r--;
           }
        }
        return new String(arr);
    }
}