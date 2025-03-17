//TC: O(m)
//SC: O(m) HashMap - freq
// m - length of the input array nums

class Solution {
    public boolean divideArray(int[] nums) {          
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int val: map.values()){
            if(val % 2 != 0){               
                return false;
            }
        }
        return true;
    }
}