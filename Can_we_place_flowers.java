class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for(int i=0;i<len;i++){
            //Checks whether the adjacent plots contain flowers or not
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==len-1 || flowerbed[i+1]==0)){
                //we plot the plant here and decrement the available plots
                flowerbed[i]=1;
                n--;
            }
        }
        // if we planted all the required plants return true else false
        if(n<=0)
            return true;
        else 
            return false;
    }
}