class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        int crrCount=0;
        Arrays.sort(nums);
        int lastSmallest=Integer.MIN_VALUE;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == lastSmallest){
                crrCount++;
                lastSmallest=nums[i];
            }
            else if(nums[i]!=lastSmallest){
                lastSmallest=nums[i];
                crrCount=1;
            }
            longest=Math.max(longest,crrCount);
        }
        return longest;
    }
}
