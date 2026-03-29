class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>set=new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    if(!set.add(board[i][j]+"in row"+i) ||
                    !set.add(board[i][j]+"in column"+j)||
                    !set.add(board[i][j]+"in block"+i/3+"--"+j/3)
                    ){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
