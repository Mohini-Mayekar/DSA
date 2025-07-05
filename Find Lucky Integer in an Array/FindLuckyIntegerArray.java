//	TC: O(n)
//	SC: O(n)
//	n - length of input arr

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int luckyNum = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                luckyNum = Math.max(luckyNum, entry.getValue());
            }
        }
        return luckyNum;
    }
}