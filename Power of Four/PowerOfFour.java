//	TC: O(log n)
//	SC: O(1)
//	n - input n

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1) return false;
        while(n % 4 == 0){
            n /= 4;
        }
        return n == 1;
    }
}