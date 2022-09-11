/*
* Problem Description
We define f(X, Y) as the number of different corresponding bits in the binary representation of X and Y.
For example, f(2, 7) = 2, since the binary representation of 2 and 7 are 010 and 111, respectively.
The first and the third bit differ, so f(2, 7) = 2.
You are given an array of N positive integers, A1, A2,..., AN.
Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 10^9+7.
*
* TC : O(N^2)
* */
package bitmanipulation;

public class CountBits {

    static int solve(int[] A) {
        long  ans=0L;

        for(int i=0;i<32;i++)
        {   long set=0L;
            long unset=0L;
            for(int j=0;j<A.length;j++)
            {
                if((A[j]&1)==1)
                    set++;
                else
                    unset++;

                A[j]=A[j]>>1;
            }

            ans+= 2*set*unset;
        }
        return (int)(ans%1000000007);

    }

}
