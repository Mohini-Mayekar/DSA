//TC: O(n^2)
//SC: O(1)
//n - length of nums

class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int n = nums.length;        
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] < nums[j]){
                    maxDiff = Math.max(maxDiff, nums[j] - nums[i]);
                }
            }
        }
        return maxDiff;
    }
}