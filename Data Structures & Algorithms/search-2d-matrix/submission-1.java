class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int s=0;
        int e=(row*col)-1;


        while(s<=e){
            int mid=s+(e-s)/2;
            int rows=mid/col;
            int cols=mid%col;

            if(matrix[rows][cols]==target){
                return true;
            }
            else if(matrix[rows][cols]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}
