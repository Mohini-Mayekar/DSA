//BFS

//TLE

//TC: O(k*m*n)
//SC: O(m*n)
class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length;
        int n = grid[0].length;
        int k = queries.length;
        int[] answer = new int[k];
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};//up, down, left, right
        int st = grid[0][0];
        for(int i = 0; i < k; i++){
            int target = queries[i];
            Queue<List<Integer>> q = new LinkedList<>();
            HashSet<List<Integer>> visited = new HashSet<>();            
            int cnt = 0;
            if(st < target){
                List<Integer> pair = Arrays.asList(0, 0);
                q.add(pair);
                cnt++;
                visited.add(pair);                
                while(!q.isEmpty()){
                    List<Integer> curr = q.poll();
                    int r = curr.get(0);
                    int c = curr.get(1);                    
                    for(int[] dir: dirs){
                        int nr = r + dir[0];
                        int nc = c + dir[1];
                        List<Integer> newPair = Arrays.asList(nr, nc);
                        if(nr >= 0 && nr < m && nc >= 0 && nc < n 
                                && !visited.contains(newPair) && grid[nr][nc] < target){                                    
                                    q.add(newPair);
                                    cnt++;
                                    visited.add(newPair);
                                }
                    }
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}