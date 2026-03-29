class Solution {
    public static void findSet(int[] nums,int index,List<List<Integer>> result,List<Integer>Current){
        // base case
        if(index==nums.length){
            result.add(new ArrayList<>(Current));
            return;
        }

        // ek solve 
        Current.add(nums[index]);
        findSet(nums,index+1,result,Current);

        Current.remove(Current.size()-1);
        findSet(nums,index+1,result,Current);

        // bakki recursion dekh lega
    }

    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result= new ArrayList<>();
       findSet(nums,0,result,new ArrayList<>());
       return result;
    }
}
