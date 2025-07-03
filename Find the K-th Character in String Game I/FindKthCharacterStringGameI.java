//	TC: O(k)
//	SC: O(k)
//	k - input

class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');

        while(sb.length() < k){
            int n = sb.length();
            for(int i = 0; i < n; i++){
                char c = sb.charAt(i);
				//Get the next char
                char nextC = (char) ((c - 'a' + 1) % 26 + 'a');
                sb.append(nextC);
            }
        }
        return sb.charAt(k-1);
    }
}