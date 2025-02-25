class Solution {

    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        int count = 0, prefixSum = 0;       
        int oddCount = 0, evenCount = 1;

        for (int num : arr) {
            prefixSum += num;            
            if (prefixSum % 2 == 0) {
                count += oddCount;
                evenCount++;
            } else {                
                count += evenCount;
                oddCount++;
            }

            count %= MOD;
        }

        return count;
    }
}

/*1*/ //TLE

/*class Solution {
    int count;
    public int numOfSubarrays(int[] arr) {
        this.count = 0;
        int n = arr.length;        
        //TC: O(n^2)
        for(int i = 0; i < n; i++){
            int currSum = 0;
            for(int j = i; j < n; j++){
                currSum += arr[j];                
                if(currSum % 2 != 0){                    
                    count++;
                }                
            }            
        }
        return count;
    }    
}*/

/*2*/ //TLE


/*
class Solution {
    int count;
    public int numOfSubarrays(int[] arr) {
        this.count = 0;
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        //TC: O(n)
        for(int i = 0; i < n; i++){
            if(i != 0){
                dp[i] = dp[i -1] + arr[i];
            }            
            if(dp[i] % 2 != 0){               
                count++;
            }
        }
        //TC: O(n^2)
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                dp[j] = dp[j] - dp[i];
                if(dp[j] % 2 != 0){                    
                    count++;
                }                
            }            
        }
        return count;
    }    
}
*/

/*3*/ //TLE

/*
class Solution {
    int count;
    public int numOfSubarrays(int[] arr) {
        this.count = 0;
        int n = arr.length;
        //TC: O(n^3)
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                calcSum(arr, i, j);
            }
        }
        return count;
    }
    public void calcSum(int[] arr, int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += arr[i];
        }
        if(sum % 2 != 0){
            count++;
        }
    }
}
*/