class Solution {
    public int maxArea(int[] height) {
      int maxWater=0;

        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int width=j-i;
                int high=Math.min(height[i],height[j]);
                if(maxWater<=width*high){
                    maxWater=width*high;
                }
            }
        }
        return maxWater;  
    }
}
