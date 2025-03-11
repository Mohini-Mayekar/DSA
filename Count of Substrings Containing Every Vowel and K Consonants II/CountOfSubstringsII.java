//TC: O(n^2)
// n - length of the input string word
//SC: O(1)
//TLE

class Solution {
    public long countOfSubstrings(String word, int k) {
        int n = word.length();
        int consonantCount = 0;
        long res = 0;
        HashMap<Character, Integer> vMap;//vowels freq map
        for(int i = 0; i < n; i++){
            vMap = new HashMap<>();
            consonantCount = 0;
            for(int j = i; j < n; j++){
                char curr = word.charAt(j);
                if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u'){
                    vMap.put(curr, vMap.getOrDefault(curr, 0) + 1);
                } else {
                    consonantCount++;
                }
                if(consonantCount > k) break;
                if(consonantCount == k && vMap.size() == 5){
                    res++;
                }
            }
        }
        return res;
    }
}