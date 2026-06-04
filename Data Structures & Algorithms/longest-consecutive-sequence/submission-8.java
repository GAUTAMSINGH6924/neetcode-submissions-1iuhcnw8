class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int count = 0;
                int current = nums[i];

                while(set.contains(current)){
                    count++;
                    current++;
                    max=Math.max(max,count);
                }
            }
        }
        return max;
    }
}
