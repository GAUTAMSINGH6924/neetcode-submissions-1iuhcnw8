class Solution {
    public int maxProduct(int[] nums) {
        int max=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=max*nums[i];
            ans=Math.max(max,ans);
            if(max==0){
                max=1;
            }
        }
        max=1;
        for(int i=nums.length-1;i>=0;i--){
            max=max*nums[i];
            ans=Math.max(max,ans);
            if(max==0){
                max=1;
            }
        }
        return ans;
    }
}
