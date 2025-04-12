//TC: O(high - low)
//SC: O(1)

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            String currStr = String.valueOf(i);
            int currLen = currStr.length();
            if(currLen % 2 == 0){
                String firstHalf = currStr.substring(0,currLen/2);
                String secondHalf = currStr.substring(currLen/2, currLen);
                int firstSum = sum(firstHalf);
                int secondSum = sum(secondHalf);
                if(firstSum == secondSum){
                    count++;
                }
            }
        }
        return count;
    }

    public int sum(String s){        
        int sum = 0;
        for(char c: s.toCharArray()){
            int charVal = Character.getNumericValue(c);
            sum += charVal;
        }
        return sum;
    }
}