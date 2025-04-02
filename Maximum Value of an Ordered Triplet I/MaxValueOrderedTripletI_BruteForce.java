//TC:O(n^3)
//SC: O(1)

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxVal = 0;
        for(int i = 0; i < n- 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    long currVal = (Long.valueOf(nums[i]) - Long.valueOf(nums[j])) * Long.valueOf(nums[k]);
                    maxVal = Math.max(maxVal, currVal);
                }
            }
        }
        return maxVal;
    }
}