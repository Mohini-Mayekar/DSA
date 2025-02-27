



/* //TLE
//TC: O(n^2)
*/

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int currSum = 0;
            for(int j = i; j < n; j++){
                currSum += nums[j];                
                maxSum = Math.max(maxSum, Math.abs(currSum));
            }            
        }
        return maxSum;
    }
}
