class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;

        int left=0;
        int right=height.length-1;

        int maxWater=0;

        while(left<right){
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);
            if(lmax<rmax){
                maxWater+=lmax-height[left];
                left++;

            }
            else{
                maxWater+=rmax-height[right];
                right--;
            }
        }
        return maxWater;
    }
}
