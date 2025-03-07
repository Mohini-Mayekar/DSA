class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n > 0){
            if(n % 3 == 0 || n % 3 == 1){
                n = n/3;
            } else{
                return false;
            }
        }
        return true;
    }
}