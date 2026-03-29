class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // make hashmap with freq of num
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num,map.get(num)+1);
        }

        // now create buckets array
        List<Integer>[] buckets=new List[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // make result list to stop value and from end find top k elements

        List<Integer> resultList=new ArrayList<>();
        for(int i=buckets.length-1;i>=0 && resultList.size()<k; i--){
            if(buckets[i]!=null){
                resultList.addAll(buckets[i]);
            }
        }

        int [] result=new int[k];
       for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
