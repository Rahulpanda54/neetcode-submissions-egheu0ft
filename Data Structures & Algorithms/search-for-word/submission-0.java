class Solution {

    public boolean exist(char[][] board, String word) {
        
        int n = board.length;    int m = board[0].length; 

        boolean vis[][] = new boolean[n][m];

        for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
              
              if(vis[i][j] == false){

                  if(help(i, j, board, word, vis, 0)){
                       return true;
                  }
              }
           }
        }

        return false;
    }

    public boolean help(int i, int j, char board[][], String word, boolean vis[][], int idx){
         
          int n = board.length;    int m = board[0].length; 

          if(i < 0 || j < 0 || i >= n || j >= m || vis[i][j] == true  || word.charAt(idx) != board[i][j]){
               return false;
          }

            if(idx == word.length()-1){
                   return true;
               }

          vis[i][j] = true;

       boolean down =    help(i+1, j, board, word, vis, idx+1);
        boolean up =     help(i-1, j, board, word, vis, idx+1);
        boolean right =   help(i, j+1, board, word, vis, idx+1);
         boolean left =   help(i, j-1, board, word, vis, idx+1);

          vis[i][j] = false;

          return right || up || down || left;
    }
}
