class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int s=0;
        int e=(rows*cols)-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            int row=mid/cols;
            int col=mid%cols;

            if(target==matrix[row][col]){
                return true;
            }
            else if(target>matrix[row][col]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
}
