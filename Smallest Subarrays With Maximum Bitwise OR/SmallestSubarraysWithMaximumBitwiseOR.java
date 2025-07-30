// 	TC: O(n^2)
//	SC: O(n^2)
//	n - length of input array - nums

class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] res = new int [n];
        long[][] dp = new long[n][n];        
        for(int i = 0; i < n ; i++){
            long currMax = 0;
            int minLen = 1;            
            for(int j = i ; j < n; j++){
                if(i == j){
                    dp[i][j] = nums[j];                         
                } else {
                    dp[i][j] = dp[i][j-1] | nums[j];                                       
                }
                if(dp[i][j] > currMax){
                    currMax = dp[i][j];
                    minLen = j - i + 1;
                }
            }
            res[i] = minLen;
        }
        return res;
    }
}