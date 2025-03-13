// TC: O(m+n)
// m: length of queries array
// n: length of nums array
// SC: O(n)

class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        int rSum = 0;
        int[] diffArr = new int[n+1];
        int k = 0;

        for(int i = 0; i < n; i++){
            while(rSum + diffArr[i] < nums[i]){
                k++;
                if(k > m) return -1;
                int l = queries[k - 1][0];
                int r = queries[k - 1][1];
                int val = queries[k - 1][2];
                if(r >= i){
                    diffArr[Math.max(l, i)] += val;
                    diffArr[r + 1] -= val;
                }
            }
            rSum += diffArr[i];
        }        
        return k;
    }
}