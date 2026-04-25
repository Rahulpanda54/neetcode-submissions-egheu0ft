class Solution {
    
    public int[][] insert(int[][] intervals, int[] newIntervals) {
        
        int n = intervals.length;

        List<List<Integer>> ans = new ArrayList<>();

        int i=0; 

        while(i < n && intervals[i][1] < newIntervals[0]){

            List<Integer> temp = new ArrayList<>();

            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);

            ans.add(temp);

            i++;
        }

        while(i < n && intervals[i][0] <= newIntervals[1]){
            
            newIntervals[0] = Math.min(newIntervals[0], intervals[i][0]);
            newIntervals[1] = Math.max(intervals[i][1], newIntervals[1]);

            i++;
        }

        List<Integer> temp = new ArrayList<>();

        temp.add(newIntervals[0]);
        temp.add(newIntervals[1]);

        ans.add(temp);


        while(i < n &&  newIntervals[1] < intervals[i][0]){

            List<Integer> list = new ArrayList<>();

            list.add(intervals[i][0]);
            list.add(intervals[i][1]);

            ans.add(list);

            i++;
        }

        int res[][] = new int[ans.size()][2];

        for(int x=0; x<ans.size(); x++){

            res[x][0] = ans.get(x).get(0);
            res[x][1] = ans.get(x).get(1);

        }

        return res;
    }
}
