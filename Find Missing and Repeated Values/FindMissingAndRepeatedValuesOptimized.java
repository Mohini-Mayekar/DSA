//TC: O(n^2)
//SC: O(1)

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;        
        int sumOfN = 0; //sum of first n natural numbers
        int sumOfNSq = 0; //sum of squares of first n natural numbers
        int sum = 0;//sum of all the elements in the grid
        int sumOfSq = 0;//sum of squares of all the elements in the grid   
        int a = 0;//duplicate
        int b = 0;//missing
		
		//Calc sum for grid
        for(int i = 0; i < n; i++){            
            for(int j = 0; j < n; j++){                
                int curr = grid[i][j];
                sum += curr;
                sumOfSq += (curr*curr);
            }
        }
		
		//Calc ideal sum for n^2
        for(int i = 1; i <= n*n; i++){            
            sumOfN += i;
            sumOfNSq += (i*i);
        }
        int sumDiff = sumOfN - sum;//b - a
        int sqDiff = sumOfNSq - sumOfSq;//b^2 - a^2 = (b+a)(b-a)
        //b+a = (b^2 - a^2)/(b - a) = ((b+a)(b-a))/(b - a)
        int sumOfRes = sqDiff/sumDiff;
        b = (sumDiff + sumOfRes)/2; //(b - a) + (b + a) = b
        a = b - sumDiff; // b - (b - a) = a

        return new int[] {a, b};
    }
}