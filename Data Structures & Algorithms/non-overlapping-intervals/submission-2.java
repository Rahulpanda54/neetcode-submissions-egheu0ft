class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
     Arrays.sort(intervals, Comparator.comparingInt(b->b[1]));

        int curr = intervals[0][1];   int count = 1;

        for(int i=0; i<intervals.length; i++){

            if(intervals[i][0] >= curr){
                count++;

                curr = intervals[i][1];
            }
        }

        return intervals.length-count;
    }
}
