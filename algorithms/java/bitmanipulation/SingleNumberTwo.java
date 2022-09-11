/*
* Problem Description
Given an array of integers, every element appears thrice except for one, which occurs once.

Find that element that does not appear thrice.

NOTE: Your algorithm should have a linear runtime complexity.
*
* Problem Constraints
2 <= A <= 5*106
0 <= A <= INTMAX
*
* Input  : A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
* Output : 4
*
*TC : O(N)
*SC : O(1)
* */
package bitmanipulation;

public class SingleNumberTwo {

    public int singleNumber(final int[] A) {
        int unique = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (((A[j] >> i) & 1) == 1)
                    count++;

            }

            if (count % 3 == 1)
                unique += 1 << i;

        }

        return unique;
    }
}
