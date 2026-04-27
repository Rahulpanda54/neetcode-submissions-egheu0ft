class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int ans = solve(coins.length-1, coins, amount);

        if(ans >= (int) 1e9){
            return -1;
        }

        return ans;
    }

    public int solve(int idx, int arr[], int x){

        if(idx == 0){

            if(x % arr[idx] == 0){
                return x/arr[idx];
            }

            else{
                   return (int)1e9;
            }
        }

        int incl  = (int)1e9;

        if(arr[idx] <= x){
            incl =  1 + solve(idx, arr, x-arr[idx]);
        }

        int excl = 0 + solve(idx-1, arr, x);

        return Math.min(incl, excl);
    }
}
