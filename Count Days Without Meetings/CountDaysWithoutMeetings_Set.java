//TC: O(nk)
//SC: O(days)
/*
    n - meetings.length
    k - avg length of all the meetings
*/

//TLE

class Solution {
    public int countDays(int days, int[][] meetings) {
        HashSet<Integer> s = new HashSet<>();
        for(int[] meet: meetings){
            int start = meet[0];
            int end = meet[1];
            while(start <= end){
                s.add(start);
                start++;
            }            
        }
        return days - s.size();
    }
}