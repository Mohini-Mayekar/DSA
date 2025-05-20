// TC: O(m * n)
// SC: O(1)
// m - length of queries
// n - length of nums

class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int cnt = 0;
        int n = nums.length;
        for(int[] query: queries){
            int l = query[0];
            int r = query[1];
            for(int i = l; i <= r; i++){
                nums[i] = Math.max(nums[i] - 1, 0);
            }
        }
        for(int num: nums){
            if(num == 0) cnt++;
        }

        return (n == cnt);
    }
}