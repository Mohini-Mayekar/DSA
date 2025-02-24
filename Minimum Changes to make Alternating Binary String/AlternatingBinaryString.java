class Solution {
    public int minOperations(String s) {
        int start0 = 0;
        int start1 = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            char curr = s.charAt(i);
            if(i % 2 == 0){
                if(curr == '0'){
                    start0++;
                } else {
                    start1++;
                }
            } else {
                if(curr == '0'){
                    start1++;
                } else {
                    start0++;
                }
            }
        }

        return Math.min(start0, start1);
    }    
}