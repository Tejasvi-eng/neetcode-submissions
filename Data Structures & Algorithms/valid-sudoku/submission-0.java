class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] setRow=new HashSet[9];
        HashSet<Character>[] setCol=new HashSet[9];
        HashSet<Character>[][] boxes=new HashSet[3][3];
        //initializing all
        for(int i=0;i<9;i++){
            setRow[i]=new HashSet<>();
            setCol[i]=new HashSet<>();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                boxes[i][j]=new HashSet<>();
            }
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val=board[i][j];
                 if(val=='.'){
                    continue;

                 }
                 else{
                    // if digit already seen in this row, col, or box → invalid
                    if(!setRow[i].add(val)) return false;
                    if(!setCol[j].add(val)) return false;
                    if(!boxes[i/3][j/3].add(val)) return false;
                 }
            }
        }
        return true;
    }
}
