//TC: O(n)
//SC: O(n) //copy of the array(to not modify the original input)
//n - length of the input array

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int[] copy = nums.clone();
        int i = 0;
        int res = 0;
        int count = 0;        
        while(i < n){
            if(i <= n - 3){
                if(copy[i] != 1){
                    //flip
                    flip(copy, i);
                    count++;
                }                
            } else {
                if(copy[i] != 0){
                    res = (res == -1) ? res : count;
                } else{
                    res = -1;
                }
            }
            i++;
        }
        return res;
    }

    private void flip(int[] copy, int idx){
        for(int i = idx; i < idx + 3; i++){
            if(copy[i] == 0){
                copy[i] = 1;
            } else {
                copy[i] = 0;
            }
        }
    }
}