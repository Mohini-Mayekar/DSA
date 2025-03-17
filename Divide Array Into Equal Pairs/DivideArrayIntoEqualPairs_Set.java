//TC: O(m log m)
//SC: O(log m) HashSet - freq
// m - length of the input array nums

class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums)       ;
        
        for(int i = 0; i < nums.length; i += 2){
            if(nums[i] != nums[i+1]){
                return false;
            }
        }        
        return true;
    }
}