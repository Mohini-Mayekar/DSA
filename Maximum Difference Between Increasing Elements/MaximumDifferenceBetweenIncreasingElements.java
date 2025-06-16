//TC: O(n)
//SC: O(1)
//n - length of nums

class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int n = nums.length;
        int prevMin = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] > prevMin){
                maxDiff = Math.max(maxDiff, nums[i] - prevMin);
            } else {
                prevMin = nums[i];
            }
        }
        return maxDiff;
    }
}