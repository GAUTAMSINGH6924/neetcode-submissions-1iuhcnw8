class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result=new int[nums.length];
        result[0]=1;

        // prefix using the result array
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]*nums[i-1];
        }

        // surfix will do
        int surfix=1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*surfix;
            surfix*=nums[i];
        }

        return result;
    }
}  
