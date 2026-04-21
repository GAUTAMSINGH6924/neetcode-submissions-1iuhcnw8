class Solution {
    public boolean canEatAll(int[]piles,int h,int mid){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=Math.ceil((double)piles[i]/mid);
        }
        return hours<=h;
    }
    public int findMax(int[] piles){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=findMax(piles);
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(canEatAll(piles,h,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }  
        return ans;
    }
}
