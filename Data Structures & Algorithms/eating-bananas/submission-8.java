class Solution {
    public int findHighest(int[] piles){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
    public boolean canEatAll(int[] piles, int h,int mid){
        long hours=0;

        for(int i=0;i<piles.length;i++){
            hours+=((long)piles[i]+mid-1)/mid;
        }

        return h>=hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=findHighest(piles);
        int ans=-1;
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
