class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] right=new int[heights.length];
        int[] left=new int[heights.length];
        Stack<Integer> r=new Stack<>();
        Stack<Integer> l=new Stack<>();
        // making an array to right 

        for(int i=heights.length-1;i>=0;i--){
            while(!r.isEmpty() && heights[i]<=heights[r.peek()]){
                r.pop();
            }
            if(!r.isEmpty()){
                right[i]=r.peek();
            }else{
                right[i]=heights.length;
            }

            r.push(i);
        }

        // left smallest number
        for(int i=0;i<heights.length;i++){
            while(!l.isEmpty() && heights[i]<=heights[l.peek()]){
                l.pop();
            }
            if(!l.isEmpty()){
                left[i]=l.peek();
            }
            else{
              left[i]=-1;  
            }

            l.push(i);
        }

        int ans=0;
        for(int i=0;i<heights.length;i++){
            int width=right[i]-left[i]-1;
            int height=heights[i];
            int currArea=height*width;

            ans=Math.max(ans,currArea);
        }
        return ans;
    }
}
