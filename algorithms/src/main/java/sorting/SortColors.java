/*
* Problem Description
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.

Note: Using the library sort function is not allowed.

* Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2

* Example Input : A = [0 1 2 0 1 2]
* Example Output: [0 0 1 1 2 2]
* 
* */
//TC : O(N)
//SC : O(1)
package sorting;

public class SortColors {

    public int[] sortByColors(int[] A) {
        int zero=0;
        int one =0;
        int two=0;
        if(A.length==1)
            return A;
        for(int i=0;i<A.length;i++)
        {
            if (A[i]==0)
                zero++;
            else if (A[i]==1)
                one++;
            else
                two++;
        }
        int index=0;
        while(zero>0)
        {
            A[index]=0;
            index++;
            zero--;
        }
        while(one>0)
        {

            A[index]=1;
            index++;
            one--;
        }
        while(two>0)
        {
            A[index]=2;
            index++;
            two--;

        }
        return A;
    }
}
