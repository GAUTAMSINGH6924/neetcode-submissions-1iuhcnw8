class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int i=0;
        int j=heights.length-1;

        while(i<j){
            int width=j-i;
            int height=Math.min(heights[i],heights[j]);
            int currentWater=width*height;
            maxWater=Math.max(currentWater,maxWater);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}
