//TC: O(n)
//SC: O(1)
// n - length of input array - nums

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;        
        int p2 = 0;
        int maxDiff = Integer.MIN_VALUE;
        for(int p1 = 0; p1 < n; p1++){
            p2 = p1 + 1;
            if(p1 == n - 1) p2 = 0;
            int currDiff = Math.abs(nums[p1] - nums[p2]);
            maxDiff = Math.max(maxDiff, currDiff);
        }        
        return maxDiff;
    }
}