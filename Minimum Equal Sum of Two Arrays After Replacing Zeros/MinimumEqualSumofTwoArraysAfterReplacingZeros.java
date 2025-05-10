//TC: O(m + n)
//SC: O(1)
// m - length of nums1
// n - length of nums2

class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long cnt1 = 0;
        long sum2 = 0;
        long cnt2 = 0;

        for(int num1: nums1){
            sum1 += num1;
            if(num1 == 0){
                sum1++;
                cnt1++;
            }
        }

        for(int num2: nums2){
            sum2 += num2;
            if(num2 == 0){
                sum2++;
                cnt2++;
            }
        }

        if((cnt1 == 0 && sum2 > sum1) || (cnt2 == 0 && sum1 > sum2)){
            return -1;
        }
        return Math.max(sum1, sum2);
    }
}