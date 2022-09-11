/*
*Problem Description
Given an array of positive integers A, two integers appear only once,
and all the other integers appear twice. Find the two integers that appear only once.

Note: Return the two numbers in ascending order.
*
* Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 10^9
*
* Input :A = [1, 2, 3, 1, 2, 4]
* Output : [3, 4]
*
* TC : O(N)
* */
package bitmanipulation;

public class SingleNumberThree {


    public   int[] solve(int []A)
    {
        int value=A[0];
        for(int i=1;i<A.length;i++)
        {
            value^=A[i];
        }

        //check bit position
        int pos=0;
        for(int i=0;i<32;i++)
        {
            if((value&1)==1)
            { pos=i;
                break;
            }
            value>>=1;
        }

        int set=0;
        int unset =0;
        for(int i=0;i<A.length;i++)
        {
            if(((A[i]>>pos)&1)==1)
                set=set^A[i];
            else
                unset=unset^A[i];
        }

        if(set>unset)
            return new int[] {unset,set};

        return new int[] {set,unset};

    }
}
