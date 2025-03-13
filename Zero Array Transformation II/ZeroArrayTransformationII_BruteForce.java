// TC: O(m*n)
// m: length of queries array
// n: length of nums array
// SC: O(1)

class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        int count = 0;
        for(int j = 0; j < n; j++){
            if(nums[j] != 0) count++;
        }
        if(count == 0) return count;

        for(int i = 0; i < m; i++){
            int st = queries[i][0];
            int end = queries[i][1];
            int val = queries[i][2];
            count = 0;
            for(int j = 0; j < n; j++){
                if(j >= st && j <= end){
                    if(nums[j] != 0){
                        nums[j] = (nums[j] - val) > 0 ? nums[j] - val : 0;
                    }
                }                
                //System.out.println(Arrays.toString(nums));
                if(nums[j] == 0) count++;
                if(count == n) return i + 1;
            }
        }
        return -1;
    }
}