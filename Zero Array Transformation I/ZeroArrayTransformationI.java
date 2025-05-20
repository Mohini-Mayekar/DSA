// TC: O(m + n)
// SC: O(n + 1) ~ O(n)
// m - length of queries
// n - length of nums

class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int cnt = 0;
        int n = nums.length;
        int[] diffArr = new int[n + 1];
        for(int[] query: queries){
            int l = query[0];
            int r = query[1];
            diffArr[l] += 1;
            diffArr[r + 1] -= 1;            
        }
        int[] cntArr = new int[n + 1];
        int currOprn = 0;
        for(int i = 0; i < n + 1; i++){
            currOprn += diffArr[i];
            cntArr[i] = currOprn;            
        }

        for(int i = 0; i < n; i++){
            if(cntArr[i] < nums[i]){
                return false;
            }
        }
        return true;
    }
}