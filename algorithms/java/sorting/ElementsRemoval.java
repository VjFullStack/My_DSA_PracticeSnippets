/*
* Problem Description
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.
Find the minimum cost to remove all elements from the array.
*
*Problem Constraints
    0 <= N <= 1000
    1 <= A[i] <= 103
*
* Example Input : A = [2, 1]
*
* Example Output: 4
* Explanation :
 Given array A = [2, 1]
 Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 Remove 1 from the array => []. Cost of this operation is (1) = 1.
 So, total cost is = 3 + 1 = 4.
* */

// Time Complexity : O(NlogN)
// Space Complexity : O(1)
package sorting;
import java.util.Arrays;

public class ElementsRemoval {

    public int solve(int[] A) {
        int sum=A[0];

        for(int i=1;i<A.length;i++)
        {
            sum+=A[i];
        }

        Arrays.sort(A);
        int cost=0;
        for(int i=A.length-1;i>=0;i--)
        {
            cost+= sum; //20+10+3
            sum=sum-A[i];
        }
        return cost;

    }
}
