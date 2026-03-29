class Solution {

    public boolean canEatAll(int[] piles,int mid,int h){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=(int)Math.ceil((double)piles[i]/mid);
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max_banana=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max_banana){
                max_banana=piles[i];
            }
        }
        int ans=-1;

        int s=1;
        int e=max_banana;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(canEatAll(piles,mid,h)){
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
