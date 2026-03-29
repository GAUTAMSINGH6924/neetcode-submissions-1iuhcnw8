class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result=new int[temperatures.length];
        Stack<Integer>str=new Stack<>();
        result[temperatures.length-1]=0;
        // using reverse for loop to iterate over temp array

        for(int i=temperatures.length-1;i>=0;i--){
            while( !str.isEmpty() && temperatures[i]>=temperatures[str.peek()]){
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
