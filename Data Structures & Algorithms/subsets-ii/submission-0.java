class Solution {
    public void helper(int[] nums,Set<List<Integer>>result,List<Integer>current,int i){
        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        helper(nums,result,current,i+1);
        current.remove(current.size()-1);

        helper(nums,result,current,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>result=new HashSet<>();
        List<Integer>current=new ArrayList<>();
        helper(nums,result,current,0);
        return new ArrayList<>(result);
    }
}
