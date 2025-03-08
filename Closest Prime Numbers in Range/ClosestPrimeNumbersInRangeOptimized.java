class Solution {
    public int[] closestPrimes(int left, int right) {    
        int num1 = -1;
        int num2 = -1;
        int p1 = num1;
        int p2 = num2;
        int min = Integer.MAX_VALUE;
        for(int i = left; i <= right; i++){
            if(isPrime(i)){
                if(p1 == -1){
                    p1 = i;
                } else if(p2 == -1){
                    p2 = i;
                } else{
                    p1 = p2;
                    p2 = i;
                }
                if(p1 != -1 && p2 != -1){
                    int diff = p2 - p1;
                    if(diff < min){
                        min = diff;
                        num1 = p1;
                        num2 = p2;
                        if(diff == 2 || diff == 1){
                            return new int[]{num1, num2};
                        }
                    }
                }                
            }            
        }
        return new int[] {num1, num2};
    }

    private boolean isPrime(int num){
        if(num < 2) return false;
        if(num == 2 || num == 3) return true;
        if(num % 2 == 0) return false;
        for(int i = 3; i*i <= num; i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }
}