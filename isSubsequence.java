class Solution {
    public boolean isSubsequence(String s, String t) {
        int curr_s=0,curr_t=0,len_s = s.length(),len_t = t.length(); //curr_s and curr_t are the pointers to the string s and t respectively
        while(curr_s<len_s && curr_t<len_t){
            if(s.charAt(curr_s)==t.charAt(curr_t)){
                //if the characters are equal then we increment the pointer of s
                curr_s++;
            }
            //In any case we increment the pointer of t
            curr_t++;
        }
        if(curr_s==len_s) //If the pointer of s reaches the end of s, then s is a subsequence of t
            return true;
        else //Else s is not a subsequence of t
            return false;
    }
}