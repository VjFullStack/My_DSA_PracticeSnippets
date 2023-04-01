/*
* Problem Description
You are given a function to_upper() consisting of a character array A.
Convert each charater of A into Uppercase character if it exists. If the Uppercase of a character
does not exist, it remains unmodified. The lowercase letters from a to z is converted to
uppercase letters from A to Z respectively. Return the uppercase version of the given character array.

* Problem Constraints
  1 <= |A| <= 10^5

* Input  : A = ['S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
* Output : ['S', 'C', 'A', 'L', 'E', 'R', 'A', 'C', 'A', 'D', 'E', 'M', 'Y']

* TC : O(N)
* SC : O(1)
* */
package strings;

public class ToUpper {

    public char[] solve(char[] A) {

        for(int i=0;i<A.length;i++)
        {

            if(A[i]>=97 && A[i]<=122 )
                A[i]^=32;
        }
        return A;
    }
}
