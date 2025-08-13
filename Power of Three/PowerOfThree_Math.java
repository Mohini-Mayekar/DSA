//	TC: O(1)
//	SC: O(1)

class Solution {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;        
    }
}