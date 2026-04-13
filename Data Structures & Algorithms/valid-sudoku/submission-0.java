class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0; i < board.length;i++){
            if(!isi(board,i)){
             return false;
            }
        }
        for(int j =0; j < board[0].length;j++){
            if(!isj(board,j)){
             return false;
            }
        }
        for(int i =0; i < board.length;i = i + 3){
            for(int j =0; j < board[0].length;j = j + 3){
               if(!isbox(board,i,j)){
             return false;
            }
             }
        }
        return true;
    }
    public boolean isi(char[][] board, int ii){
        HashSet<Integer> themap = new HashSet<>();
        for(int i =0; i < board[ii].length;i++){
            if(Character.isDigit(board[ii][i])){
            int num = Character.getNumericValue(board[ii][i]);
            if(themap.contains(num)){
                return false;
            }else{
                themap.add(num);
            }
            }
        }
        return true;
    }
    public boolean isj(char[][] board, int j){
         HashSet<Integer> themap = new HashSet<>();
        for(int i =0; i < board.length;i++){
            if(Character.isDigit(board[i][j])){
            int num = Character.getNumericValue(board[i][j]);
            if(themap.contains(num)){
                return false;
            }else{
                themap.add(num);
            }
            }
        }
        return true;
    }
     public boolean isbox(char[][] board, int ii, int jj){
        HashSet<Integer> themap = new HashSet<>();
        for(int i =ii; i < ii + 3;i = i + 1){
            for(int j =jj; j < jj+3;j = j + 1){
               if(Character.isDigit(board[i][j])){
            int num = Character.getNumericValue(board[i][j]);
            if(themap.contains(num)){
                return false;
            }else{
                themap.add(num);
            }
            }
            }
             }
             return true;
    }
}
