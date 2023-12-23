class Solution {
    public int compress(char[] chars) {
        //If chars contain single character we just return 1
        if(chars.length==1)
            return 1;
        char curr=chars[0]; //Current character for which we want to find the count
        int count = 0; //Maintains the count of current character
        int l=0; //Maintains the position to place the characters and count
        for(char ch:chars){
            if(ch==curr){
                count++; //If ch is equal to current character, we increment count
            }
            else{
                //If ch is not equal to the current character, we store the count in in chars array
                chars[l] = curr;
                if(count>1){
                    String count2 = Integer.toString(count);
                    for(char i:count2.toCharArray()){
                        chars[++l] = i;
                    }
                }
                //Update the current character, count and l 
                curr=ch;
                count=1;
                l=l+1;
            }
        }
        //Adding Last character count
        chars[l] = curr;
        if(count>1){
            String count2 = Integer.toString(count);
            for(char i:count2.toCharArray()){
                chars[++l] = i;
            }
        }
        return l+1;
    }
}