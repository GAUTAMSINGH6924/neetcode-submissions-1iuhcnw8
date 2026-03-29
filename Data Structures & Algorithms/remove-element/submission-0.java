class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;

        while(i<j){
            if(nums[j]==val){
                j--;
            }
            else if(nums[i]!=val){
                i++;
            }
            else if(nums[i]==val && nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        int count=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        return count;
    }
}