//TC: O(nlogn)
//SC: O(n)

class Solution {
    public int minOperations(int[] nums, int k) {        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i = 0; i < n; i++){
            int curr = nums[i];
            if(curr < k) return -1;
            if(!map.containsKey(curr)){
                pq.add(curr);
            }
            map.put(curr, map.getOrDefault(curr, 0) + 1);            
        }

        int oprn = 0;
        while(!pq.isEmpty()){
            int currMax = pq.poll();
            if(pq.size() > 0){
                int nextMax = pq.peek();
                int currMaxCnt = map.get(currMax);
                int nextMaxCnt = map.get(nextMax);
                map.remove(currMax);
                map.put(nextMax, currMaxCnt + nextMaxCnt);
                if(nextMax == k){//k is present in the array the it will be the smallest element in pq
                    pq.poll();
                } else if(map.size() == 1){//k is not present in the array
                    pq.poll();
                    oprn++;
                }
                oprn++;
            } else{
                if(currMax != k){
                    oprn++;
                }
            }            
        }
        return oprn;
    }
}