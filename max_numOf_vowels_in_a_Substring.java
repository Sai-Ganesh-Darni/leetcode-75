// Problem: 1456. Maximum Number of Vowels in a Substring of Given Length
// Using Sliding Window
class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou"; //vowels string
        int maxCount=0; //stores the maximum number of vowels in a substring of length k
        int count =0; //stores the number of vowels in a substring of length k
        //We first calculate the number of vowels in the first substring of length k which is the first window
        for(int i=0;i<k;i++){
            char ch = s.charAt(i); 
            if(vowels.indexOf(ch)!=-1){
                count++; //If ch is a vowel, we increment count
            }
        }
        int len = s.length();
        maxCount=count;
        //Now we slide the window by adding the next element and removing the first element and calculate the maximum count of vowels
        for(int i=k;i<len;i++)
        {
            // If the first element of the window is a vowel, we decrement the count
            if(vowels.indexOf(s.charAt(i-k))!=-1){
                count--;
            }
            // If the last element of the window is a vowel, we increment the count
            if(vowels.indexOf(s.charAt(i))!=-1){
                count++;
            }            
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}