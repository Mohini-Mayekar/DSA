//TC: O(n) + O(n^3) =~ O(n^3)
//SC: O(n) //HashMap size
//n = length of the input array

class Solution {
    HashMap<Integer, Integer> map;
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        this.map = new HashMap<>(); 
        for(int i = 0; i < n; i++){
            map.put(arr[i], i);
        }       
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){            
                int p1 = i;
                int p2 = j;            
                int curr = 0;
                while(p2 < n){
                    int sum = arr[p1] + arr[p2];
                    if(map.get(sum) == null)break;
                    int sum_index = map.get(sum);
                    p1 = p2;
                    p2 = sum_index;
                    if(curr == 0){
                        curr = 2;
                    }
                    curr++;
                }

                maxLen = Math.max(maxLen, curr);
            }
        }
        return maxLen;
    }
}