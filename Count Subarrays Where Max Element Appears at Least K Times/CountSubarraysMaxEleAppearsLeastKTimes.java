//TC: O(n)
//SC: O(1)

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        long cnt = 0;        
        for(int num: nums){
            max = Math.max(max, num);            
        }
        int l = 0;
        int maxCnt = 0;
        for(int r = 0; r < n; r++){
            if(max == nums[r]){
                maxCnt++;
            }
            while(maxCnt == k){
                if(nums[l] == max){
                    maxCnt--;
                }
                l++;
            }
            cnt += l;            
        }
        return cnt;
    }
}