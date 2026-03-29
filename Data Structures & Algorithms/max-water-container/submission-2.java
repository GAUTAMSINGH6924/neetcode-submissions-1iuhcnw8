class Solution {
    public int maxArea(int[] heights) {
        int maxWater=Integer.MIN_VALUE;

        int i=0;
        int j=heights.length-1;

        while(i<j){
            int l=j-i;
            int b=Math.min(heights[i],heights[j]);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
            maxWater=Math.max(maxWater,l*b);
        }
        return maxWater;
    }
}
