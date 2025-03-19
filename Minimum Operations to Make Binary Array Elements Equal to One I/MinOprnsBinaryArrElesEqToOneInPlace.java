//TC: O(n)
//SC: O(1)
//n - length of the input array

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int i = 0;
        int res = 0;
        int count = 0;        
        while(i < n){
            if(i <= n - 3){
                if(nums[i] != 1){
                    //flip
                    flip(nums, i);
                    count++;
                }                
            } else {
                if(nums[i] != 0){
                    res = (res == -1) ? res : count;
                } else{
                    res = -1;
                }
            }
            i++;
        }
        return res;
    }

    private void flip(int[] nums, int idx){
        for(int i = idx; i < idx + 3; i++){
            if(nums[i] == 0){
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
    }
}