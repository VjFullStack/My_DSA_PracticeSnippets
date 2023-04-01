/*
* Problem Description :
You are given an array A of N elements. Sort the given array in increasing order of number of distinct
factors of each element,  i.e., element having the least number of factors should be the first to
be displayed and the number having highest number of factors should be the last one.If 2 elements have
same number of factors, then number with less value should come first.

* Problem Constraints
1 <= N <= 10^4
1 <= A[i] <= 10^4

* Input  : A = [6, 8, 9]
* Output : [9, 6, 8]
* Explanation : The number 9 has 3 factors, 6 has 4 factors and 8 has 4 factors.

* TC : O(NlogN)
* SC : O(1)
*/
package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class FactorsSort {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Collections.sort(A,(a, b)->compare(a,b));

        return A;
    }

    public int compare(Integer I1, Integer I2) {
        int f1 = getfactorsCount(I1);
        int f2 = getfactorsCount(I2);
        if(f1>f2)
        { return 1;}
        else if(f2>f1)
        {return -1;}
        else if (f1==f2)
        {
            if(I1>I2)
            {
                return 1;
            }
            else if(I2>I1)
            {
                return -1;
            }
            else{
                return 0;
            }


        }

        return 0;
    }


    static int getfactorsCount(int n)
    {   int c=0;
        for(int i=1;i*i<=n;i++)
        {


            if(i*i==n){
                c=c+1;}
            else  if(n%i==0)
            {
                c=c+2;
            }


        }
        return c;


    }
}
