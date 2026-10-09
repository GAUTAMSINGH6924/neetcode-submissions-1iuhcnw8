class Solution {

    public int findBiggest(int[] piles){
        int max=0;

        for(int num:piles){
            max=Math.max(max,num);
        }

        return max;
    }
    public boolean canEatAll(int[] piles, int h,int mid){
        int hours=0;

        for(int i=0;i<piles.length;i++){
            hours+=(piles[i]+mid-1)/mid;
        }

        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int biggestNumber=findBiggest(piles);

        int s=1;
        int e=biggestNumber;
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
