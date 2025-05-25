// TC: O(n*m)
// SC: O(1)
//  n - number of input words
//  m - Avg length of the word that would be traversed, where we find char in the current word

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String curr = words[i];
            if(curr.indexOf(x) != -1){
                res.add(i);
            }
        }
        return res;
    }
}