class Solution {
    public int findMin(int[] nums) {
        
        int min = Integer.MAX_VALUE;

        int st = 0;  int end = nums.length-1;

        while(st <= end){

            int mid = (st + end)/2;

            if(nums[st] <= nums[mid]){

                min = Math.min(min,  nums[st]);

                st = mid+1;
            }

            else{
                   min = Math.min(min,  nums[mid]);

                   end = mid-1;
            }
        }

        return min;
    }
}
