class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int totalnum = row * col;
        int count = 0;
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;

        List<Integer> result = new ArrayList<>();

        while (left <= right && top <= bottom) {
            // left to right    
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // TOP TO BOTTOM
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            //RIGTH TO LEFT
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom to top
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }
}