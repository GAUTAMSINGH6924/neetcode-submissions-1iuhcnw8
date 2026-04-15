class Solution {
    public void helper(int[] candidates, int target,List<List<Integer>>result,List<Integer>current,int i){
        if(target==0){
            result.add(new ArrayList<>(current));
        }
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]){
                continue;
            }
            if(candidates[j]>target)break;

            current.add(candidates[j]);
            helper(candidates,target-candidates[j],result,current,j+1);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,result,current,0);
        return result;
    }
}
