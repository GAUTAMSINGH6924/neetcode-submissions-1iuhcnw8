class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(String word:strs){
            char[] str=word.toCharArray();
            Arrays.sort(str);
            String Key=new String(str);

            if(!map.containsKey(Key)){
                map.put(Key,new ArrayList<>());
            }
            map.get(Key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
