//TC: O(n)
//SC: O(1)

class Solution {
    public long coloredCells(int n) {
        long coloredCells = 0;
        long prev = 1;
        int i = 1;

        while(i <= n){
            coloredCells = prev + 4*(i - 1);
            prev = coloredCells;
            i++;
        }
        return coloredCells;
    }
}

/*

	logic for n = prev + 4 * ( n - 1)
	
	n		prev		logic				o/p
-------------------------------------------------
	1		1			1 + 4 *(1 - 1)		1
	2		1			1 + 4 *(2 - 1)		5
	3		5			5 + 4 *(3 - 1)		13
	4		13			13+ 4 *(4 - 1)		25

*/