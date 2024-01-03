class Solution {
    public int[][] merge(int[][] intervals) {
        
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] temp = intervals[0];
        
        for(int i=1;i<intervals.length;i++){
            if(temp[1]>=intervals[i][0]){
                if(temp[1]<intervals[i][1]) temp[1]=intervals[i][1];   
            }
            else {
                merged.add(temp);
                temp=intervals[i];
            }
        }
        merged.add(temp);
        return merged.toArray(new int[merged.size()][]);
    }
}