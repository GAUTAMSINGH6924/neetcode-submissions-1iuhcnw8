class Solution {
    public void helper(int[]nums,int n,List<List<Integer>>result,List<Integer>current){
        if(n==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[n]);
        helper(nums,n+1,result,current);

        current.remove(current.size()-1);
        helper(nums,n+1,result,current);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();

        helper(nums,0,result,current);
        return result;
    }
}
