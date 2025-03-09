/*
TC: O((n-k)*k)  ~ O(n*k)
SC: O(1)
*/

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= n-k; i++){
            int count = 0;
            for(int j = i; j < i + k; j++){                
                char curr = blocks.charAt(j);
                if(curr == 'W'){
                    count++;
                }
                if(j == (i + k - 1)){
                    min = Math.min(min, count);
                }
            }
        }
        return min;
    }
}