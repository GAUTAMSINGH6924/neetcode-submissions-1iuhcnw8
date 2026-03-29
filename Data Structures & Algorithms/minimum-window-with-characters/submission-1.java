class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>(256);
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,0);
            }
            map.put(ch,map.get(ch)+1);
        }
        int left=0;
        int right=0;
        int minSize=Integer.MAX_VALUE;
        int count=0;
        int startIdx=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count++;
                }
                map.put(ch,map.get(ch)-1);
            }

            while(count==t.length()){
                int length=right-left+1;
                if(minSize>length){
                    minSize=length;
                    startIdx=left;
                }

                char leftCh=s.charAt(left);

                if(map.containsKey(leftCh)){
                    map.put(leftCh,map.get(leftCh)+1);
                    if(map.get(leftCh)>0){
                        count--;
                    }
                }
                left++;
            }
            right++;
        }
        return minSize==Integer.MAX_VALUE ? "" :s.substring(startIdx,startIdx+minSize);
    }
}
