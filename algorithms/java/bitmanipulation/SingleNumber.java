/*
* Problem Description
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
*
* Problem Constraints
2 <= |A| <= 2000000
0 <= A[i] <= INTMAX
*
* Input :A = [1, 2, 2, 3, 1]
*
* Output : 3
*
* TC : O(N)
* SC : O(1)
* */
package bitmanipulation;

public class SingleNumber {

    public int solve(final int[] A) {
        int unique = A[0];

        for(int i=1; i<A.length; i++)
        {
            unique^=A[i];
        }

        return unique;
    }
}
