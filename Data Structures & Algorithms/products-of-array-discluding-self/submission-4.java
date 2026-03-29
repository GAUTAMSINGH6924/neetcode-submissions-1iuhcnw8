class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix=new int [nums.length];
        int [] surfix=new int [nums.length];
        int [] result=new int [nums.length];
        Arrays.fill(prefix,1);
        Arrays.fill(surfix,1);
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            surfix[i]=surfix[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            result[i]=prefix[i]*surfix[i];
        }
        return result;
    }
}  
