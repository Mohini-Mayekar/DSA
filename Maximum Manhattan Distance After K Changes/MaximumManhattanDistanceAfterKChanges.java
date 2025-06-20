// TC: O(n)
// SC: O(1)
// n - length of input string - 's'

class Solution {
    public int maxDistance(String s, int k) {
        int res = 0;
        int n = s.length();
        int latitude = 0;
        int longitude = 0;        

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            switch(c){
                case 'N':
                    latitude++;
                    break;
                case 'S':
                    latitude--;
                    break;
                case 'E':
                    longitude++;
                    break;
                case 'W':
                    longitude--;
                    break;
                default:
                    break;
            }            

            res = Math.max(res, Math.min(Math.abs(latitude) + Math.abs(longitude) + k*2, i + 1));
        }
        return res;
    }
}


/*

class Solution {
    public int maxDistance(String s, int k) {
        int res = 0;
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;

        for(char c: s.toCharArray()){
            switch(c){
                case 'N':
                    north++;
                    break;
                case 'S':
                    south++;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    west++;
                    break;
                default:
                    break;
            }

            int t1 = Math.min(Math.min(north, south), k);

            int t2 = Math.min(Math.min(east, west), k - t1);

            res = Math.max(res, helper(north, south, t1) + helper(east, west, t2));
        }
        return res;
    }

    private static int helper(int cnt1, int cnt2, int t){
        return Math.abs(cnt1-cnt2) + t * 2;
    }
}

*/