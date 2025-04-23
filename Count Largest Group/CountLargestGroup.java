class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> countMap = new HashMap<>();        
        int max = 0;
        for(int i = 1; i <= n; i++){
            int currSum = sum(i);
            countMap.put(currSum, countMap.getOrDefault(currSum, 0) + 1);
            max = Math.max(max, countMap.get(currSum));
        }
        int finalMax = max;
        long cnt = countMap.values()
        .stream()
        .filter(item -> (item == finalMax))
        .count();

        return (int) cnt;
    }

    public static int sum(int n){        
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}