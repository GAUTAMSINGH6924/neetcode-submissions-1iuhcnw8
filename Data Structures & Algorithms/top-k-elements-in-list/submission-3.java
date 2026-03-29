class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i],map.get(nums[i])+1);
        }

        List<Integer>[] bucket=new List[nums.length+1];

        for(int num:map.keySet()){
            int freq=map.get(num);

            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int [] res=new int[k];
        int idx=0;
        for(int i=bucket.length-1;i>=0 && idx<k;i--){
            if(bucket[i]!=null){
                for(int numss:bucket[i]){
                    res[idx++]=numss;
                    if(idx==k)break;
                }
            }
        }
        return res;
    }
}
