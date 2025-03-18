//TC: O(n^4) =~ O(n^4)
//SC: O(1) 
//n = length of the input array
//TLE

class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int res = 1;
        
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){                
                int l = i;
                int h = j;                
                int curr = 0;
                for(int k = l; k < h; k++){
                    for(int m = k + 1; m <= h; m++){                        
                        int bitwiseAnd = nums[k] & nums[m];                        
                        if(bitwiseAnd != 0){
                            curr = -1;
                            break;
                        }
                    }
                }
                if(curr != -1){                    
                    res = Math.max(res, h - l + 1);
                } else {
                    res = res;
                }                    
            }
        }
        return res;
    }
}