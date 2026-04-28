class Solution {

    public int minPathSum(int[][] grid) {

        int n = grid.length;   int m = grid[0].length;

        int dp[][] =  new int[n+1][m+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                dp[i][j] = -1;
            }
        }
        
        return solve(0, 0, n, m, grid, dp);
    }

    public int solve(int i, int j, int n, int m, int grid[][], int dp[][]){

        if(i >= n || j >= m){
            return (int)1e9;
        }

        if(i == n-1 && j == m-1){
            return grid[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int down = grid[i][j] + solve(i+1, j, n, m, grid, dp);
        int right = grid[i][j] + solve(i, j+1, n, m, grid, dp);

        return dp[i][j] =  Math.min(down, right);

    }
}