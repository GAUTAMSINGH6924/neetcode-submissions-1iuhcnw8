class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String word:strs){
            str.append(word.length()).append('#').append(word);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String>result=new ArrayList<>();
        int i=0;

        while(i<str.length()){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));

            String word=str.substring(j+1,j+1+len);

            result.add(word);
            i=j+1+len;
        }
        return result;
    }
}
