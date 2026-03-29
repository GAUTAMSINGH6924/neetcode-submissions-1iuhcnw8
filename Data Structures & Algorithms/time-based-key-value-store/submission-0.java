class TimeMap {
    private Map<String,List<Pair<Integer,String>>>map;
    public TimeMap() {
       map=new HashMap<>(); 
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair<>(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        String res="";
        if(map.containsKey(key)){
            List<Pair<Integer,String>>list=map.get(key);

            // binary search 

            int s=0;
            int e=list.size()-1;
            while(s<=e){
                int mid=s+(e-s)/2;

                if(list.get(mid).getKey()<=timestamp){
                    res=list.get(mid).getValue();
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
            return res;
    }
}
