class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        int s=0;
        int e=(row*column)-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            int rows=mid/column;
            int cols=mid%column;
            if(matrix[rows][cols]==target){
                return true;
            }
            else if(matrix[rows][cols]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}
