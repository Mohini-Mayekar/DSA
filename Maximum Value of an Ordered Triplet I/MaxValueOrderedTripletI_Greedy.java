//TC:O(n^2)
//SC: O(1)

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxVal = 0;
        int i = 0;
        for(int k = 2; k < n; k++){
            int maxPrefix = nums[i];
            for(int j = 1; j < k; j++){
                long currVal = (Long.valueOf(maxPrefix - nums[j]) * nums[k]);
                maxVal = Math.max(maxVal, currVal);
                maxPrefix = Math.max(maxPrefix, nums[j]);
            }
        }        
        return maxVal;
    }
}