//Three pass solution
//TC: O(n)
//SC: O(n)// HashMap - freqMap
//n - size of input list- nums
class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        int maxCnt = 0;
        int domEle = 0;
        int res = -1;
        for(int i = 0; i < n; i++){
            int num = nums.get(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(maxCnt < map.get(num)){
                maxCnt = map.get(num);
                domEle = num;
            }
        }
        int lCnt = 0;
        int rCnt = 0;
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