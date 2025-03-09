/*

TC: O(n)
SC: O(1)
*/

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int min = Integer.MAX_VALUE;        
        int count = 0;
        for(int j = 0; j < k; j++){                
            char curr = blocks.charAt(j);
            if(curr == 'W'){
                count++;
            }
            if(j == (k - 1)){
                min = Math.min(min, count);
            }
        }        
        int p1 = 0;
        int p2 = k;
        for(int i = p2; i < n; i++){
            char prev = blocks.charAt(p1);
            if(prev == 'W'){
                count--;                
            }
            char next = blocks.charAt(i);
            if(next == 'W'){
                count++;
            }
            p1++;
            min = Math.min(min, count);
        }        
        return min;
    }
}