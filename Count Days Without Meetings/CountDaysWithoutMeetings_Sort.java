//TC: O(n log n)
//SC: O(log n)
/*
    n - meetings.length    
*/

class Solution {
    public int countDays(int days, int[][] meetings) {
        int freeDays = 0;
        int maxEnd = 0;

        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        for(int[] meet: meetings){
            int start = meet[0];
            int end = meet[1];
            if(start > maxEnd + 1) {
                freeDays += start - maxEnd - 1;
            }
            maxEnd = Math.max(maxEnd, end);
        }
        freeDays += days - maxEnd;
        return freeDays;
    }
}