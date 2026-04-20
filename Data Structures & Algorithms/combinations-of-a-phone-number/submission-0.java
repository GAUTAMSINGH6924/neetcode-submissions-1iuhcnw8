class Solution {
    public static String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public void helper(String digits,int index,List<String>result,String current){
        if(index==digits.length()){
            result.add(current);
            return;
        }

        char charDigit=digits.charAt(index);
        String map=keypad[charDigit-'0'];

        for(int i=0;i<map.length();i++){
            helper(digits,index+1,result,current+map.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>result=new ArrayList<>();
        if(digits.length()==0)return result;
        helper(digits,0,result,"");
        return result;
    }
}
