class Solution {
    public int heightChecker(int[] heights) {
        int[] helper=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            helper[i]=heights[i];
        }

        int count=0;
        Arrays.sort(helper);

        for(int i=0;i<helper.length;i++){
            if(helper[i]!=heights[i]){
                count++;
            }
        }

        return count;
    }
}