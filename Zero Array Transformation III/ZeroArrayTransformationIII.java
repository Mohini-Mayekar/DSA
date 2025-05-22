class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length;
        
        Arrays.sort(queries, (a, b) -> (a[0] - b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int[] diffArray = new int[n + 1];
        int oprns = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            oprns += diffArray[i];
            while( j < queries.length && queries[j][0] == i){
                pq.add(queries[j][1]);
                j++;
            }
            while(oprns < nums[i] && !pq.isEmpty() && pq.peek() >= i){
                oprns += 1;
                diffArray[pq.poll() + 1] -= 1;
            }
            if(oprns < nums[i]){
                return -1;
            }
        }
        return pq.size();
    }
}