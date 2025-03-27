//Three pass solution
//TC: O(n)
//SC: O(1)
//n - size of input list- nums
class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        int maxCnt = 0;
        int domEle = nums.get(0);
        int count = 0;
        int res = -1;
        for (int num : nums) {
            if (num == domEle) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                domEle = num;
                count = 1;
            }
        }
        int lCnt = 0;
        int rCnt = 0;
        for (int num : nums) {
            if (num == domEle) {
                maxCnt++;
            }
        }
        if(nums.get(0) == domEle){
            lCnt++;            
        }
        rCnt = maxCnt - lCnt;        
        int lLen = 0;
        int rLen = 0;

        for(int i = 0; i < n - 1; i++){
            lLen = i + 1;
            rLen = n - lLen;
            if(i != 0 && nums.get(i) == domEle){
                lCnt++;
                rCnt--;
            }
            if((lCnt*2 > lLen) && (rCnt*2 >rLen)){
                res = i;
                break;
            }
        }
        return res;
    }
}