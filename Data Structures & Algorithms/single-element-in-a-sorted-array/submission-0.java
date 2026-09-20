class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length > 2) {
            if (nums[0] != nums[1]) {
                return nums[0];
            }

            if (nums[nums.length - 1] != nums[nums.length - 2]) {
                return nums[nums.length - 1];
            }
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid > 0 && mid < nums.length - 1 && nums[mid] != nums[mid + 1]
                && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            else if (mid > 0 && nums[mid] == nums[mid - 1] && mid % 2 == 0
                || mid < nums.length - 1 && nums[mid] == nums[mid + 1] && mid % 2 == 1) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}