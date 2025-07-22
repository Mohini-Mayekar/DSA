//	TC: O(n)
//	SC: O(n)
//	n - length of input array nums

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int maxSum = 0;        
        Set<Integer> s = new HashSet<>();
        int currSum = 0;
        int st = 0;
        for(int i = st; i < n; i ++){
            int currVal = nums[i];
            if(!s.contains(currVal)){
                s.add(currVal);
                currSum += currVal;
                maxSum = Math.max(maxSum, currSum);
            } else {
                if(st<n){
                    int curr = nums[st];
                    while(st < n && currVal != curr){
                        currSum -= nums[st];
                        s.remove(nums[st]);
                        st++;
                        curr = nums[st];
                    }                    
                    st++;                    
                }                
                maxSum = Math.max(maxSum, currSum);
            }
        }
        maxSum = Math.max(maxSum, currSum);    
        return maxSum;
    }
}