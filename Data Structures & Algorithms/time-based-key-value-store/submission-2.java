class TimeMap {
    HashMap<String,List<Pair<String,Integer>>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new Pair<>(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        List<Pair<String,Integer>>temp=map.get(key);
        String res="";
        int s=0;
        int e=temp.size()-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(temp.get(mid).getValue() <= timestamp){
                res=temp.get(mid).getKey();
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return res;
    }
}
