// TC: O(n)
// SC: O(n)
// n -  length of input string

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();        
        StringBuilder sb = new StringBuilder(s);
        if(n % k != 0){
            int m = n % k;
            m = k - m;
            for(int i = 0; i < m; i++){
                sb.append(fill);
            }
        }
        n = sb.length();
        String[] res = new String[n/k];
        for(int i = 0; i < n - k + 1; i = i + k){
            res[i/k] = sb.substring(i, i+k);
        }
        return res;
    }
}