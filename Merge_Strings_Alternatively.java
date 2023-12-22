class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;   
        int l1 = word1.length(),l2 = word2.length();
        String res = "";
        int k=0;
        while(i<l1 || j<l2){
            if(i<l1){
                res+=word1.charAt(i++);
            }
            if(j<l2){
                res+=word2.charAt(j++);
            }
        }
        return res;
    }
}