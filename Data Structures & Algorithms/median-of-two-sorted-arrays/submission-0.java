class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double arr[]  = new double[nums1.length + nums2.length];

        int i=0;   int j = 0;   int idx = 0;

        while(i < nums1.length && j < nums2.length){

            if(nums1[i] <= nums2[j]){
                arr[idx++] = nums1[i++];
            }

            else{
                  arr[idx++] = nums2[j++];
            }
        }

        while(i < nums1.length){
            arr[idx++] = nums1[i++];
        }

        while(j < nums2.length){
            arr[idx++] = nums2[j++]; 
        }

        if(arr.length % 2 == 1){
            return arr[arr.length/2];
        }

        else{
               return ((arr[arr.length/2] + arr[arr.length/2  - 1])/2.0);
        }
    }
}
