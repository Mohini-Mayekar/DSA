//TC: O(n)
//SC: O(n)

class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] forces = new int[n];
        int force = 0;
        for(int i = 0; i < n; i++){
            char currChar = dominoes.charAt(i);
            if(currChar == 'R'){
                force = n;
            } else if(currChar == 'L'){
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] += force;
        }
        force = 0;
        for (int i = n - 1; i >= 0; i--){
            char currChar = dominoes.charAt(i);
            if(currChar == 'R'){
                force = 0;
            } else if(currChar == 'L'){
                force = n;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] -= force;
        }

        StringBuilder res = new StringBuilder();
        for(int val: forces){
            res.append(
                val > 0 ? 'R' : (val < 0 ? 'L' : '.')
            );
        }
        return res.toString();
    }
}