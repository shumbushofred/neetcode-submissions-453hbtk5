class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 1;
        Arrays.sort(piles);
        int right = piles[piles.length-1];
         while(left < right){
            int speed = left + ((right - left)/2);
            int hours = helper(piles,speed);
            System.out.println("before " + left +"  "+right+ "  "+hours+ "  "+ speed);
            if(hours <= h){
                right = speed;
            }else{
                left = speed +1;
            }
            System.out.println("after " +left +"  "+right);
         }
         return left;
        
    }
    public int helper(int[] piles, int speed){
        int ans=0;
        for(int i: piles){
            int div = i / speed;
            ans += div;
            if(i % speed != 0) ans++; 
        }
        return ans;
    }
}