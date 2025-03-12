//TC: O(log n)
//SC: O(1)

class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos = n - posIdx(nums, n);
        int neg = negIdx(nums, n);
        
        return Math.max(pos, neg);
    }

    private int posIdx(int[] nums, int n){
        int l = 0;
        int h = n - 1;
        int idx = n;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(nums[mid] <= 0){
                l = mid + 1;
            } else {
                h = mid - 1;
                idx = mid;
            }
        }
        return idx;
    }


    private int negIdx(int[] nums, int n){
        int l = 0;
        int h = n - 1;
        int idx = n;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(nums[mid] < 0){
                l = mid + 1;
            } else {
                h = mid - 1;
                idx = mid;
            }
        }
        return idx;
    }
}