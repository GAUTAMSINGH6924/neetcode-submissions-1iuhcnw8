class Solution {
    public void helper(int[] candidates, int target,List<List<Integer>>result,List<Integer>current,int idx){
        if(target==0){
            result.add(new ArrayList<>(current));
            // return;
        }

        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target)break;
            current.add(candidates[i]);
            helper(candidates,target-candidates[i],result,current,i+1);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        helper(candidates,target,result,current,0);
        return result;
    }
}
