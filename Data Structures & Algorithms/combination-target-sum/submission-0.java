class Solution {
    Set<List<Integer>>set;
    public void helper(int[] nums, int target,List<List<Integer>> result,List<Integer> current,int i){
            if(i==nums.length ||  target<0){
                return;
            }
            if(target==0){
                if(set.add(new ArrayList<>(current))){
                result.add(new ArrayList<>(current));}
            }
            current.add(nums[i]);
            helper(nums,target-nums[i],result,current,i);

            current.remove(current.size()-1);
            helper(nums,target,result,current,i+1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        set=new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        helper(nums,target,result,current,0);
        return result;
    }
}
