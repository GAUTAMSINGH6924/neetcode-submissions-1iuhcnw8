class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int s=0;
        int e=heights.length-1;

        while(s<=e){
            int width=e-s;
            int height=Math.min(heights[s],heights[e]);
            int max=width*height;

            if(heights[s]<heights[e]){
                s++;
            }
            else{
                e--;
            }
            maxWater=Math.max(maxWater,max);
        }
        return maxWater;
    }
}
