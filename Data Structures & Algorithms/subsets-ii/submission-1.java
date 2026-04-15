class Solution {
    public void helper(int[] nums,List<List<Integer>>result,List<Integer>current,int i){
        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        helper(nums,result,current,i+1);
        current.remove(current.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[idx]==nums[i]){
            idx++;
        }
        helper(nums,result,current,idx);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        helper(nums,result,current,0);
        return result;
    }
}
