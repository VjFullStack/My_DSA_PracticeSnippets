/*
* Problem Description
Given an integer array A, find if an integer p exists in the array such
 that the number of integers greater than p in the array equals p.

* Problem Constraints
    1 <= |A| <= 2*10^5
    1 <= A[i] <= 10^7

* Input  : A = [3, 2, 1, 3]
* Output : 1
* Explanation : For integer 2, there are 2 greater elements in the array.

* TC: O(N)
* SC: O(1)
* */

package sorting;

import java.util.Arrays;

public class NobleInteger {

    public int solve(int[] A) {

        Arrays.sort(A);
        int ans= 0;
        int n = A.length;


        if(A[n-1]==0)
            return 1;

        for(int i=0; i<A.length-1; i++)
        {
            if((A[i]<A[i+1]) && (A[i]== (n-(i+1))))
            {
                ans=1;
                break;

            }

        }
        return ans>0?1:-1;
    }
}
