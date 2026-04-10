class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>str=new Stack<>();
        int[] result=new int[temperatures.length];
        result[temperatures.length-1]=0;

        for(int i=temperatures.length-1;i>=0;i--){
            while(!str.isEmpty() && temperatures[i]>=temperatures[str.peek()]){
                str.pop();
            }

            if(!str.isEmpty()){
                result[i]=str.peek()-i;
            }
            str.push(i);
        }
        return result;
    }
}
