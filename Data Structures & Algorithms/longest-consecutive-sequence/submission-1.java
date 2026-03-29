class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lastSmallest=Integer.MIN_VALUE;
        int longest=1;
        int crrcount=0;
        if (nums.length==0){
            return 0;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmallest){
                lastSmallest=nums[i];
                crrcount+=1;
            }
            else if(nums[i] != lastSmallest){
                lastSmallest=nums[i];
                crrcount=1;
            }
            longest= Math.max(longest,crrcount);
        }
        return longest;
    }
}
