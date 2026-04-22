class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
         int n = grid.length;   int m = grid[0].length;

        boolean vis[][] = new boolean[n][m];

        int count = 0;   int max = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(vis[i][j] == false && grid[i][j] == 1){

                int area = dfs(i, j, vis, grid);

                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }

    public int  dfs(int i, int j, boolean vis[][], int grid[][]){

          int n = grid.length;   int m = grid[0].length;

        if(i < 0 || j < 0 || i >= n || j >= m || vis[i][j] == true || grid[i][j]  == 0){
            return 0;
        }

        vis[i][j] = true;

       return 1 + dfs(i+1, j, vis, grid) + dfs(i-1, j, vis, grid) + dfs(i, j+1, vis, grid) +  dfs(i, j-1, vis, grid);

    }
}
