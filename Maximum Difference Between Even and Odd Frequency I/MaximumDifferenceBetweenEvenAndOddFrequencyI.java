//TC: O(n)
//SC: O(26) ~ O(1)
// n - length of input string s

class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
    
        int maxOdd = 1;
        int minEven = s.length();
        for(int val: map.values()){            
            if(val % 2 == 0){
                minEven = Math.min(minEven, val);
            } else {
                maxOdd = Math.max(maxOdd, val);
            }                       
        }
        return maxOdd - minEven;
    }
}



/*
class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c - 'a']++;            
        }

        System.out.println(Arrays.toString(freq));
        int maxOdd = 1;
        int minEven = s.length();
        for(int i = 0; i < 26; i++){
            int currVal = freq[i];
            if(currVal > 0){
                if(currVal % 2 == 0){
                    minEven = Math.min(minEven, currVal);
                } else {
                    maxOdd = Math.max(maxOdd, currVal);
                }
            }            
        }
        return maxOdd - minEven;
    }
}

*/