class Solution {
    public int helper(int []arr,Integer[][]dp,int i,int j){
        if(i>j){
            return 0;
        }

        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int max=Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            int cost=arr[i-1]*arr[k]*arr[j+1]+helper(arr,dp,i,k-1)+helper(arr,dp,k+1,j);

            max=Math.max(max,cost);
        }

        return dp[i][j]=max;
    }
    public int maxCoins(int[] nums) {
        int[]arr=new int[nums.length+2];
        arr[0]=1;
        arr[arr.length-1]=1;
        for(int i=0;i<nums.length;i++){
            arr[i+1]=nums[i];
        }

        Integer[][]dp=new Integer[nums.length+2][nums.length+2];

        return helper(arr,dp,1,nums.length);
    }
}
