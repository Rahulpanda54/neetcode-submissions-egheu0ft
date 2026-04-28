class Solution {

    public int change(int amount, int[] coins) {

        int dp[][] = new int[coins.length][amount+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                dp[i][j] = -1;
            }
        }

        return solve(0, coins, amount, dp);

    }

    public int solve(int idx, int arr[], int x, int dp[][]){

        if(idx == arr.length-1){

            if(x % arr[idx] == 0){
                return 1;
            }

            else{
                    return 0;
            }
        }

        if(dp[idx][x] != -1){
            return dp[idx][x];
        }

        int incl = 0;

        if(arr[idx] <= x){

            incl = solve(idx, arr, x-arr[idx], dp);
        }

        int excl = solve(idx+1, arr, x, dp);

        return dp[idx][x] =  incl + excl;

    }
}
