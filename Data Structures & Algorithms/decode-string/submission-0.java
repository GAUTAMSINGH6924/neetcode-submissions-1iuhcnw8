class Solution {
    public String decodeString(String s) {
        Stack<Integer>number=new Stack<>();
        Stack<String>strs=new Stack<>();
        String res="";
        int i=0;

        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                int count=0;
                while(Character.isDigit(s.charAt(i))){
                    count=10*count+(s.charAt(i)-'0');
                    i++;
                }
                number.push(count);
            }

            else if(s.charAt(i)=='['){
                strs.push(res);
                res="";
                i++;
            }
            else if(s.charAt(i)==']'){
                StringBuilder str=new StringBuilder(strs.pop());
                int numCount=number.pop();
                for(int k=0;k<numCount;k++){
                    str.append(res);
                }
                res=str.toString();
                i++;
            }
            else{
                res+=s.charAt(i++);
            }
        }

        return res;
    }
}