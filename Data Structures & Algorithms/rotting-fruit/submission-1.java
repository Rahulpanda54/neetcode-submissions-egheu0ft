class Solution {

    public int orangesRotting(int[][] grid) {

        if(grid.length == 0 || grid == null){
               return -1;
        }
        
        int n = grid.length;    int m = grid[0].length;

        int time[][] = new int[n][m];

        for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){

                time[i][j] = Integer.MAX_VALUE;
           }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(grid[i][j] == 2){

                        dfs(i, j, time, grid, 0);
                }
            }
        }


        int timereq = 0;

        for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){

                if(grid[i][j] == 1){

                        if(time[i][j] == Integer.MAX_VALUE){
                                return -1;
                        }

                     timereq = Math.max(timereq, time[i][j]);   
                }
           }
        }

        return timereq;
    }

    public void dfs(int i, int j, int time[][] , int grid[][], int currtime){
       
       int n = grid.length;  int m = grid[0].length;

       if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0 || time[i][j] <= currtime){
           return;
       }

       time[i][j] = currtime;

       dfs(i+1,  j, time, grid, currtime+1);
       dfs(i-1, j, time, grid, currtime+1);
       dfs(i, j+1, time, grid, currtime+1);
       dfs(i, j-1, time, grid, currtime+1);


    }
}
