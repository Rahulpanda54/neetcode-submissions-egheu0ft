class Solution {

    public int minCostClimbingStairs(int[] cost) {

        int dp[] = new int[cost.length+1];

        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }

        return Math.min(solve(cost.length-1, cost, dp) , solve(cost.length-2 , cost, dp));
    }

    public int solve(int idx, int arr[], int dp[]){

        if(idx == 0 || idx == 1){
            return arr[idx];
        }

        if(idx < 0){
            return (int)1e9;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int onestep = arr[idx] + solve(idx-1, arr, dp);
        int twostep = arr[idx] + solve(idx-2, arr, dp);

        return dp[idx] =  Math.min(onestep, twostep);


    }
}
