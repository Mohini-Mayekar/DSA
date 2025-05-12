//TC: O(n^3)
//SC: O(1)

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> s = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    int currNum = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if(currNum >= 100 && currNum % 2 == 0){
                        s.add(currNum);
                    }
                }
            }
        }
        int[] res = new int[s.size()];
        int i = 0;
        for(int num: s){
            res[i++] = num;
        }
        Arrays.sort(res);
        return res;

    }
}