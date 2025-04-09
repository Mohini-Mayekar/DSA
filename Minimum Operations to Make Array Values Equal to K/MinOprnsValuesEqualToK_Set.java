//TC: O(n)
//SC: O(n)

class Solution {
    public int minOperations(int[] nums, int k) {                
        HashSet<Integer> set = new HashSet<>();        
        for (int x : nums) {
            if (x < k) {
                return -1;
            } else if (x > k) {
                set.add(x);
            }
        }               
        return set.size();
    }
}