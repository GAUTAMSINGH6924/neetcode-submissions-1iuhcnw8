class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(Integer i:set){
            if(!set.contains(i-1)){
                int count=0;
                for(int j=i;set.contains(j);j++){
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
