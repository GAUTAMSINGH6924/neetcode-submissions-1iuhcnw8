class Solution {
    public int findMax(int [] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
    public boolean canEatAll(int[] piles, int h,int mid){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=Math.ceil((double)piles[i]/mid);
        }
        return hours<=h;
    }   
    public int minEatingSpeed(int[] piles, int h) {
        int s=0;
        int e=findMax(piles);
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(canEatAll(piles,h,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
