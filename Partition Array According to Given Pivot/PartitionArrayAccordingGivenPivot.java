/**
Two pass solution

TC: O(n)
SC: O(n)
 */

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int lEq = 0;
        int eq = 0;             
        for(int i = 0; i < n; i++){
            int curr = nums[i];
            map.put(i, curr);
            if(curr < pivot) {
                lEq++;
            } else if( curr == pivot) {
                eq++;
            }
        }
        int lEqSt = 0;
        int eqSt = lEq;
        int gEqSt = lEq + eq;

        for(int i = 0; i < n; i++){
            int curr = map.get(i);
            if(curr < pivot) {
                nums[lEqSt] = curr;
                lEqSt++;
            } else if( curr == pivot) {
                nums[eqSt] = curr;
                eqSt++;
            } else {
                nums[gEqSt] = curr;
                gEqSt++;
            }
        }
        return nums;
    }
}