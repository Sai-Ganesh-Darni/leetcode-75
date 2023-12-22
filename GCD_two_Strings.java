class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            //checks whether two strings form common divisor or not
            return new String();
        }
        else{
            int gcd = gcd(str1.length(),str2.length()); //returns the gcd of two strings which will be the length of the common divisor of two strings
            return str1.substring(0,gcd);
        }
    }
    public int gcd(int x,int y)
    {
        if(y==0)
            return x;
        else
            return gcd(y,x%y);
    }
}