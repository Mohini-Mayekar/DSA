//TC: O(n^2)
//SC: O(1)
//TLE

class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int res  = 0;
        for(int i = 0; i < n; i++){
            HashMap<Character, Integer> map = new HashMap<>();            
            for(int j = i; j < n; j++){
                char curr = s.charAt(j);
                map.put(curr, map.getOrDefault(curr, 0) + 1);
                if(map.size() == 3){
                    res++;
                }
            }
        }
        return res;
    }
}