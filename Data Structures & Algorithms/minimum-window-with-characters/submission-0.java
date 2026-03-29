class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map=new HashMap<>(256);
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }

        int left=0;
        int right=0;
        int startIdx=0;
        int minSize=Integer.MAX_VALUE;
        int count=0;

        while(right<s.length()){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count+=1;
                }
                map.put(ch,map.get(ch)-1);
            }
            while(count==t.length()){
                int length=right-left+1;

                if(length<minSize){
                    minSize=length;
                    startIdx=left;
                }
                char leftch=s.charAt(left);

                if(map.containsKey(leftch)){
                     map.put(leftch, map.get(leftch) + 1);
                    if (map.get(leftch) > 0) {
                        count--;
                    }
                }
                left++;
            }
            right++;
        }
        return minSize == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minSize);
    }
}
