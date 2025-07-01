// TC: O(n)
// SC: O(1)
// n - length of the input string

/*

	Increment the sub count till sequential characters are same. 
	When there is a mis-match add the count to result and start comparing 
	the characters from where we encountered a mis-match and reset sub count to 0.
	res is initialized to 1 because the given string itself is possible original string

*/
class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int p1 = 0;
        int p2 = 1;
        int cnt = 0;
        int res = 1;
        while(p2 < n){
            if(word.charAt(p1) == word.charAt(p2)){
                cnt++;
            } else {
                res += cnt;
                p1 = p2;
                cnt = 0;
            }
            p2++;
        }
        res += cnt;
        return res;
    }
}