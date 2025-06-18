//TC: O(n logn) + O(n) ~= O(n logn)
//SC: O(1)
//	n - length of nums

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int[][] res = new int[n/3][3];
        for(int i = 0; i < n - 2; i=i+3){
            int prev = nums[i];
            int curr = nums[i + 1];
            int next = nums[i + 2];
            if(Math.abs(prev - curr) <= k && Math.abs(curr - next) <= k && Math.abs(next - prev) <= k){
                res[i/3][0] = prev;
                res[i/3][1] = curr;
                res[i/3][2] = next;
            } else {
                return new int[0][0];
            }
        }
        return res;
    }
}