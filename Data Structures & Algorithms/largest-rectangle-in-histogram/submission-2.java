class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> left=new Stack<>();
        Stack<Integer> right=new Stack<>();
        int[] lft=new int[heights.length];
        int[] rgt=new int[heights.length];

        // right smallest element 
        for(int i=heights.length-1;i>=0;i--){
            while(!right.isEmpty() && heights[i]<=heights[right.peek()]){
                right.pop();
            }
            if(!right.isEmpty()){
                rgt[i]=right.peek();
            }
            else{
                rgt[i]=heights.length;
            }
            right.push(i);
        }

        // left smallest element 
        for(int i=0;i<heights.length;i++){
            while(!left.isEmpty() && heights[i]<=heights[left.peek()]){
                left.pop();
            }
            if(!left.isEmpty()){
                lft[i]=left.peek();
            }
            else{
                lft[i]=-1;
            }
            left.push(i);
        }

        int ans=0;

        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=rgt[i]-lft[i]-1;
            int currArea=height*width;
            ans=Math.max(ans,currArea);
        }
        return ans;
    }
}
