/*
* Problem Description
You have an array A with N elements. We have two types of operation available on this array :
We can split an element B into two elements, C and D, such that B = C + D.
We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
You have to determine whether it is possible to convert array A to size 1,
containing a single element equal to 0 after several splits and/or merge?
*
* Problem Constraints
1 <= N <= 100000
1 <= A[i] <= 106
*
* Input  : A = [9, 17]
* Output : Yes
*
* Explanation :
 Following is one possible sequence of operations -
 1) Merge i.e 9 XOR 17 = 24
 2) Split 24 into two parts each of size 12
 3) Merge i.e 12 XOR 12 = 0
 As there is only 1 element i.e 0. So it is possible.
 *
 *
* */
package bitmanipulation;

public class InterestingArray {

    public String solve(int[] A) {
        int sum=A[0];

        for(int i=1;i<A.length;i++)
        sum+=A[i];

        if(sum%2==1)
            return "No";

        return "Yes";
    }

}
