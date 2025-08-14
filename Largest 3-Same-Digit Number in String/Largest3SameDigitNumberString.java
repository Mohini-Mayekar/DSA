//	TC:	O(n)
//	SC:	O(1)
//	n - length of input string num

class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String maxStr = "";
        int i = 0;
        while(i < n - 2){
            char c1 = num.charAt(i);
            char c2 = num.charAt(i + 1);
            char c3 = num.charAt(i + 2);
            if(c1 == c2 && c2 == c3){
                String currSubStr = num.substring(i, i + 3);
                if(maxStr.isEmpty() || currSubStr.compareTo(maxStr) > 0){
                    maxStr = currSubStr;
                }
                i = i + 3;
            } else {
                i++;
            }
        }   
        return maxStr;
    }
}