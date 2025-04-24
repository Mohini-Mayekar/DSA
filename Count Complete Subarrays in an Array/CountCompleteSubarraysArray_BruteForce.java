class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int totalDistinct = getDistinctCount(nums, 0, n - 1);
        for(int i = 0; i <= n - totalDistinct; i++){
            for(int j = i + totalDistinct -1; j < n; j++){
                int currDistinct = getDistinctCount(nums, i, j);
                if(totalDistinct == currDistinct) cnt++;
            }
        }
        return cnt;
    }

    private static int getDistinctCount(int[] nums, int i, int j){
        Set<Integer> currSet = new HashSet<>();
        for(int k = i; k <= j; k++){
            currSet.add(nums[k]);
        }
        return currSet.size();
    }
}