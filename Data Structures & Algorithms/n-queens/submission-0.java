class Solution {

    public void solve(int col,List<List<String>> result,char[][]board,int n){
        if(col==n){
            result.add(constructBoard(board));
            return;
        }

        for(int row=0;row<n;row++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                solve(col+1,result,board,n);
                board[row][col]='.';
            }
        }
    }

    public boolean isSafe(char[][]board,int row,int col){
        int i=row;
        int j=col;

        while(j>=0){
            if(board[i][j]=='Q')return false;
            j--;
        }
        j=col;

        while(i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i<board.length && j>=0){
            if(board[i][j]=='Q')return false;
            i++;
            j--;
        }
        return true;
    }

    public List<String> constructBoard(char[][]board){
        List<String>res=new ArrayList<>();
        for(char[]row:board){
            res.add(new String(row));
        }
        return res;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>result=new ArrayList<>();
        char[][]board=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(0,result,board,n);
        return result;
    }
}
