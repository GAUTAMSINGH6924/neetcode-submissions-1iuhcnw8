class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lastSmallest=Integer.MIN_VALUE;
        int longest=1;
        int crrCount=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmallest){
                crrCount++;
                lastSmallest=nums[i];
            }
            else if(lastSmallest != nums[i]){
                lastSmallest=nums[i];
                crrCount=1;
            }
            longest=Math.max(longest,crrCount);
        }
        return longest;
    }
}
