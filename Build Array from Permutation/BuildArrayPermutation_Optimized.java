//TC: O(n)
//SC: O(1)
//In - place

class Solution {

    public int[] buildArray(int[] nums) {
        int n = nums.length;        
        for (int i = 0; i < n; ++i) {
            nums[i] += 1000 * (nums[nums[i]] % 1000);
            //1000 because of the constraints
        }        
        for (int i = 0; i < n; ++i) {
            nums[i] /= 1000;
        }
        return nums;
    }
}