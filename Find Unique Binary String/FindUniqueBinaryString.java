class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        int max = (int) Math.pow(2, n);
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < n; i++){
            int decimalVal = decimalVal(nums[i], n);
            if(!s.contains(decimalVal)){
                s.add(decimalVal);
            }
        }       
        for(int j = 0; j < max; j++){
            if(!s.contains(j)){
                return binaryVal(j, n);
            }
        }
        return "";
    }

    private int decimalVal (String binary, int n){
        int val = 0;       
        for(int i = 0 ; i < n; i++){           
           val += ((Character.getNumericValue(binary.charAt(i)))*(Math.pow(2, (n-i-1))));
        }        
        return val;
    }

    private String binaryVal(int num, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            int k = num >> i;
            if ((k & 1) > 0)
                sb.append("1");                
            else
                sb.append("0");                
        }
        return sb.toString();
    }
}