class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValidSudokurow(board) && isValidSudokucolumn(board) && isValidSudokusubbox(board);
    }
    public boolean isValidSudokurow(char[][] board) {
        HashSet<Integer> helper = new HashSet<>();
        for(int i =0; i < board.length;i++){
          for(int j =0; j < board[i].length;j++){
            if(Character.isDigit(board[i][j])){
                int temp = Character.getNumericValue(board[i][j]);
                if(helper.contains(temp)){
                    return false;
                }
                else
                {
                    helper.add(temp);
                }
            }
        }
        helper.clear();
        }
        return true;
    }
    public boolean isValidSudokucolumn(char[][] board) {
        HashSet<Integer> helper = new HashSet<>();
        for(int i =0; i < board[0].length;i++){
          for(int j =0; j < board.length;j++){
            if(Character.isDigit(board[j][i])){
                int temp = Character.getNumericValue(board[j][i]);
                if(helper.contains(temp)){
                    return false;
                }else{
                    helper.add(temp);
                }
            }
        }
        helper.clear();
        }
        return true;
    }
    public boolean isValidSudokusubbox(char[][] board) {

        for(int i =0; i < board.length; i +=3){
          for(int j =0; j < board[i].length;j +=3){
           if(!isValidSudokusubboxhelper(board, i, j)){
            return false;
           }
        }
        }
        return true;
    }
    public boolean isValidSudokusubboxhelper(char[][] board, int ii, int jj) {
             HashSet<Integer> helper = new HashSet<>();
        for(int i =ii; i < ii+3;i++){
          for(int j =jj; j < jj+3;j++){
            if(Character.isDigit(board[i][j])){
                int temp = Character.getNumericValue(board[i][j]);
                if(helper.contains(temp)){
                    return false;
                }else{
                    helper.add(temp);
                }
            }
        }
        }
        return true;
    }
}
