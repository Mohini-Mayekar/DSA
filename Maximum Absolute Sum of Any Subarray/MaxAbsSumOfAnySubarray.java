
//TC: O(n)
//SC: O(1)

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int minRSum = Integer.MAX_VALUE;
        int maxRSum = Integer.MIN_VALUE;
        int rSum = 0;
        for(int i = 0; i < n; i++){
            rSum += nums[i];

            minRSum = Math.min(minRSum, rSum);
            maxRSum = Math.max(maxRSum, rSum);

            if(rSum >= 0){
                maxSum = Math.max(maxSum, Math.max(rSum, rSum - minRSum));
            } else {
                maxSum = Math.max(maxSum, Math.max(Math.abs(rSum), Math.abs(rSum - maxRSum)));
            }                      
        }
        return maxSum;
    }
}

/*

//TC: O(n)
//SC: O(1)

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;        
        int minRSum = 0;
        int maxRSum = 0;
        int rSum = 0;
        for(int i = 0; i < n; i++){
            rSum += nums[i];

            minRSum = Math.min(minRSum, rSum);
            maxRSum = Math.max(maxRSum, rSum);                                
        }
        return maxRSum - minRSum;
    }
}

*/