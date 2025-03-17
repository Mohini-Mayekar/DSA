//TC: O(m)
//SC: O(m) HashSet - freq
// m - length of the input array nums

class Solution {
    public boolean divideArray(int[] nums) {           
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                set.remove(num);
            } else {
                set.add(num);
            }
        }        
        return set.isEmpty();
    }
}