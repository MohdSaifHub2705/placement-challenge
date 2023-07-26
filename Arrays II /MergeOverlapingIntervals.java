class Solution {
    public int[][] merge(int[][] intervals) {
        // sort the intervals into start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();

        for(int[] interval : intervals) {
            if(result.isEmpty() || interval[0] > result.get(result.size()-1)[1]){
                result.add(interval);
            } else {
                result.get(result.size() -1)[1] = Math.max(interval[1], result.get(result.size()-1)[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
