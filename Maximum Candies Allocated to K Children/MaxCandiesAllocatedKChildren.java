//TC: O(n logm)
//SC: O(1)
//n - length of candies array
//m - max number of candies in a pile (given input)

class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int max = 0;
        
        for(int candy: candies){
            max = Math.max(max, candy);
        }

        int l = 0;
        int h = max;

        while(l < h){
            int mid = (l + h + 1)/2;

            if(canAlloc(candies, n, k, mid)){
                l = mid;
            } else {
                h = mid - 1;
            }
        }        
        return  l;
    }

    private boolean canAlloc(int[] candies, int n, long k, int currDistribution){
        long maxChildAlloc = 0;
        for(int candy: candies){
            maxChildAlloc += candy/currDistribution;
        }
        return maxChildAlloc >= k;
    }

}