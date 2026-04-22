class Solution {

    public int numIslands(char[][] grid) {
        
        int n = grid.length;   int m = grid[0].length;

        boolean vis[][] = new boolean[n][m];

        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(vis[i][j] == false && grid[i][j] == '1'){

                    dfs(i, j, vis, grid);

                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int i, int j, boolean vis[][], char grid[][]){

          int n = grid.length;   int m = grid[0].length;

        if(i < 0 || j < 0 || i >= n || j >= m || vis[i][j] == true || grid[i][j]  == '0'){
            return;
        }

        vis[i][j] = true;

        dfs(i+1, j, vis, grid);
        dfs(i-1, j, vis, grid);
        dfs(i, j+1, vis, grid);
        dfs(i, j-1, vis, grid);

    }
}
