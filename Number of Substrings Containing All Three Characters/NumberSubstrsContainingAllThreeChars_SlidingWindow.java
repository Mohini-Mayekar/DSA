//TC: O(n)
//SC: O(1)

class Solution {
    public int numberOfSubstrings(String s) {
        int charCount = 3; //number of unique characters input string can have
        int n = s.length();
        int res  = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>(); 
        for(int r = 0; r < n; r++){                                   
            char curr = s.charAt(r);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            if(map.size() == charCount){
                //if we found our charCount string that implies all the other char after current substring are also valid strings
                int temp = n - r;
                res += temp;                
                while(map.size() == charCount){                    
                    char prev = s.charAt(l);
                    map.put(prev, map.get(prev) - 1);
                    if(map.get(prev) == 0){
                        map.remove(prev);
                    }
                    //if charCount is still valid after removing left char then all the substrings for current r are valid after l
                    if(map.size() == charCount){
                        res += temp;
                    }
                    l++;
                }                
            }            
        }
        return res;
    }
}