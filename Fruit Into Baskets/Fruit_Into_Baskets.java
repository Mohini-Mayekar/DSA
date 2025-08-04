//	TC: O(n)
//	SC: O(n)
//	n - length of input array fruits

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxRes = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int st = 0;
        for(int i = 0; i < n; i++){
            int curr = fruits[i];
            if(map.size() == 2 && !map.containsKey(curr)){
                while(map.size() == 2 && st < n){
                    int val = fruits[st];
                    map.put(val, map.get(val) - 1);
                    if(map.get(val) == 0){
                        map.remove(val);
                    }
                    st++;
                }
            }
            map.put(curr, map.getOrDefault(curr, 0) + 1);            
            maxRes = Math.max(maxRes, i - st + 1);
        }        
        return maxRes;
    }    
}