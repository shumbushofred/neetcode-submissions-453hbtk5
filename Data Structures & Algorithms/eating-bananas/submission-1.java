class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      Arrays.sort(piles);
        int low =0;
        int high = piles[piles.length-1];
        System.out.println(high);
        while(low < high){
           int mid = low + (high - low)/2;
            System.out.println("mid "+ mid);
           int numm = helper(piles,mid);
             System.out.println("numm "+ numm);
            if(numm <= h){ 
             high= mid;
            }else{
             low = mid + 1;
            }
             System.out.println("low "+ low + "high "+ high);
        }
        return low;

    }
    public int helper(int[] piles, int h){
       int sum =0;
        // System.out.println(h);
        for(int i: piles){
            int temp = (int) Math.ceil((double)i/h);
            // System.out.println("ee"+ temp);
            sum += temp;
        }
        return sum;
    }
}
