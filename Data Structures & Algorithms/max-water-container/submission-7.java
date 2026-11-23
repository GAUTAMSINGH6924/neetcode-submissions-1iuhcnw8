class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=heights.length-1;

        while(i<j){
            int length=Math.min(heights[i],heights[j]);
            int breath=j-i;

            if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;
            }

            max=Math.max(max,length*breath);
        }
        return max;
    }
}
