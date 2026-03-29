class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();

        // for loop to traverse in array 
        for(String word:strs){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String Key=new String(chars);

            if(!map.containsKey(Key)){
                map.put(Key,new ArrayList<>());
            }
            map.get(Key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
