class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int start=0;
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch) && map.get(ch)>=start){
                start=map.get(ch)+1;
            }
            map.put(ch,i);

            max=Math.max(max,i-start+1);
        }
        return max;
    }
}
