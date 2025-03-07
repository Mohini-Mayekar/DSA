//TC: O(n^2)
//SC: O(n^2)

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;        
        HashSet<Integer> s = new HashSet<>();
        int a = 0;//duplicate
        int b = 0;//missing
		
		//Iterate over the grid and if curr num is not present in hashset we add it to set and if it is already present we have found the duplicate number
        for(int i = 0; i < n; i++){            
            for(int j = 0; j < n; j++){                
                int curr = grid[i][j];
                if(!s.contains(curr)){
                    s.add(curr);
                } else{
                    a = curr;//duplicate
                }
            }
        }
		//check if any number fom 1 to n^2 is not present in the hashset that's our missing number
        for(int i = 1; i <= n*n; i++){            
            if(!s.contains(i)){
                b = i;
            }
        }
        return new int[] {a, b};
    }
}