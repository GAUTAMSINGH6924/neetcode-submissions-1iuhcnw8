class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            int j=i+1;
            if(nums[i]==nums[j]){
                return true;
            }
            i++;
        }
        return false;
    }
}