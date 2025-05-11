//TC: O(n)
//SC: O(1)
//n  - length of the array - arr

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int oddCnt = 0;
        for(int i: arr){
            if(i % 2 == 0){
                oddCnt = 0;
            } else {
                oddCnt++;
                if(oddCnt == 3){
                    return true;
                }
            }
        }
        return false;
    }
}