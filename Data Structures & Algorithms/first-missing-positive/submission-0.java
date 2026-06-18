class Solution {
    public int firstMissingPositive(int[] nums) {
        int missing=1;
        HashSet<Integer>map=new HashSet<>();

        for(int num:nums){
            map.add(num);
        }

        for(int i=0;i<nums.length;i++){
            if(map.contains(missing)){
                missing++;
            }
        }

        return missing;
    }
}