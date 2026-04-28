class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

     int n = obstacleGrid.length;  int m = obstacleGrid[0].length;

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                dp[i][j] = -1;
            }
        }
        
        return solve(0, 0, n,m,obstacleGrid, dp);
    }

    public int solve(int i, int j, int n, int m, int grid[][] , int dp[][]){

        if(i >= n || j >= m){
            return 0;
        }

        if(grid[i][j] == 1){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

         if(dp[i][j] != -1){
            return dp[i][j];
         }

        int down = solve(i+1, j, n, m, grid, dp);
        int right = solve(i, j+1, n, m, grid, dp);

        return dp[i][j] =  down + right;

    }
}