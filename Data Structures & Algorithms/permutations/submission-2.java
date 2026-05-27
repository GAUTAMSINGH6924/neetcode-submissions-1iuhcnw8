class Solution {
    public void swap(int i,int j,int []nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void helper(int [] nums,List<List<Integer>>result,int i){
        if(i==nums.length){
            List<Integer>permute=new ArrayList<>();
            for(int num:nums){
                permute.add(num);
            }
            result.add(new ArrayList<>(permute));
            return;
        }

        for(int j=i;j<nums.length;j++){
            swap(i,j,nums);
            helper(nums,result,i+1);
            swap(i,j,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        helper(nums,result,0);
        return result;
    }
}
