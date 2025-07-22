//	TC: O(n^2)
//	SC: O(n)
//	n - length of input array nums

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        for(int st = 0; st < n; st++){
            Set<Integer> s = new HashSet<>();
            int currSum = 0;
            for(int i = st; i < n; i ++){
                int currVal = nums[i];
                if(!s.contains(currVal)){
                    s.add(currVal);
                    currSum += currVal;
                } else {
                    break;
                }
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}