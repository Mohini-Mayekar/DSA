//TC: O(n + m) /O(max(n,m))
//SC: O(m)
// n - length of s1/s2
// m - length of baseStr

class Solution {
    int[] mappings = new int[26];

    private int find(int x){
        if(mappings[x] != x){
            mappings[x] = find(mappings[x]);
        }

        return mappings[x];
    }

    private void group(int x, int y){
        x = find(x);
        y = find(y);

        if(x == y){
            return;
        }

        if(x < y){
            mappings[y] = x;
        } else {
            mappings[x] = y;
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {

        for(int i = 0; i < 26; i++){
            mappings[i] = i;
        }
        
        //Grouping
        int n = s1.length();
        for(int i = 0; i < n; i++){
            group(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        StringBuilder res = new StringBuilder();
        for(char c: baseStr.toCharArray()){
            res.append((char) (find(c - 'a') + 'a'));
        }

        return res.toString();
    }
}