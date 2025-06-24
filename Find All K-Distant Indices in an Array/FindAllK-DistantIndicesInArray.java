// TC: O(n^2)
// SC: O(n)
// n - length of input array - nums

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();        
        List<Integer> keyIdxList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] == key) keyIdxList.add(i);
        }
        int m = keyIdxList.size();
        for(int p1 = 0; p1 < n; p1++){
            int p2 = 0;
            while(p2 < m){
                if(Math.abs(p1 - keyIdxList.get(p2)) <= k){
                    res.add(p1);
                    p2 = m;
                } else {
                    p2++;
                }
            }
        }    
        return res;
    }
}

/*

// TC: O(n^2)
// SC: O(n)
// n - length of input array - nums

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        List<Integer> keyIdxList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] == key) keyIdxList.add(i);
        }
        for(int i = 0; i < n; i++){
            if(!s.contains(i)){
                for(int j = 0; j < keyIdxList.size(); j++){
                    if(Math.abs(i - keyIdxList.get(j)) <= k){
                        s.add(i);
                        break;
                    }
                }
            }            
        }
        s.forEach(x -> res.add(x));

        res.sort((a,b) -> a-b);

        return res;
    }
}

*/