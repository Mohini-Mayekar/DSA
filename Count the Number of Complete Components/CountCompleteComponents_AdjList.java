class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] adjList = new ArrayList[n];
        Map<List<Integer>, Integer> componentFreq = new HashMap<>();
        int resCount = 0;
        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<>();
            adjList[i].add(i);
        } 

        for(int[] edge: edges){
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }

        for(int i = 0; i < n; i++){
            List<Integer> adjacentVertex = adjList[i];
            Collections.sort(adjacentVertex);
            componentFreq.put(adjacentVertex, componentFreq.getOrDefault(adjacentVertex, 0) + 1);
        }

        for(Map.Entry<List<Integer>, Integer> entry: componentFreq.entrySet()){
            if(entry.getKey().size() == entry.getValue()){
                resCount++;
            }
        }

        return resCount;
    }
}