/*
* Problem Description
You are given a function to_lower() which takes a character array A as an argument.
Convert each character of A into lowercase characters if it exists. If the lowercase of a character
does not exist, it remains unmodified. The uppercase letters from A to Z are converted to
lowercase letters from a to z respectively. Return the lowercase version of the given character array.

*  Problem Constraints
    1 <= |A| <= 10^5

* Input : A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
* Output :  ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']

* TC : O(N)
* SC : O(1)
* */
package strings;

public class ToLower {

    public char[] solve(char[] A) {



        for(int i=0;i<A.length;i++)
        {

            if(A[i]>=65 && A[i]<=90 )
                A[i]^=32;
        }
        return A;
    }
}
