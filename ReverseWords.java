class Solution {
    public String reverseWords(String s) {
        //Remove trailing spaces and divides into words
        String[] str = s.trim().split("\\s+");
        String res="";
        int len = str.length;
        //Adds words in reverse order
        for(int i=len-1;i>0;i--)
            res+=str[i]+" ";
        return res+=str[0];
    }
}