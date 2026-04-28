class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    int i=0;  int n = intervals.length;

    while(i < n && intervals[i][1] < newInterval[0]){

        ArrayList<Integer> ds = new ArrayList<>();

        ds.add(intervals[i][0]);
        ds.add(intervals[i][1]);

        ans.add(ds);

        i++;
    }

    while(i < n && intervals[i][0] <= newInterval[1]){
        
        newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
        newInterval[1] = Math.max(intervals[i][1], newInterval[1]);

        i++;
    }

    ArrayList<Integer> l1 = new ArrayList<>();

    l1.add(newInterval[0]);
    l1.add(newInterval[1]);

    ans.add(l1);


    while(i < n && newInterval[1] < intervals[i][0]){

        ArrayList<Integer> ds = new ArrayList<>();

        ds.add(intervals[i][0]);
        ds.add(intervals[i][1]);

        ans.add(ds);

        i++;
    }

      int arr[][] = new int[ans.size()][2];

      for(int j=0; j<ans.size(); j++){

        arr[j][0] = ans.get(j).get(0);
        arr[j][1] =  ans.get(j).get(1);
      }

      return arr;


    }
}
