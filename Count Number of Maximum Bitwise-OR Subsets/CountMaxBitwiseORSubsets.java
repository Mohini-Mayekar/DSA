//	TC: O(2^n)
// 	SC: O(2^n)
//	n - length of input array nums

class Solution {
    Map<Integer, Integer> map;
    int maxVal = 0;
    public int countMaxOrSubsets(int[] nums) {
        this.map = new HashMap<>();     
        helper(nums, 0, 0);
        return map.get(maxVal);
    }

    private void helper(int[] nums, int currBitwiseOrVal, int idx){
        //base
        if(idx == nums.length){
            maxVal = Math.max(maxVal, currBitwiseOrVal);
            map.put(currBitwiseOrVal, map.getOrDefault(currBitwiseOrVal, 0) + 1);
            return;
        }
        
        //choose
        helper(nums, currBitwiseOrVal | nums[idx], idx+1);
        //not-choose
        helper(nums, currBitwiseOrVal, idx+1);                
    }
}