/*
* Problem Description :
You are given a string S, and you have to find all the amazing substrings of S.
An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

* Input
    ABEC

* Output
    6

* Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
* TC : O(N)
* SC : O(1)
* */

package strings;

public class AmazingSubArrays {

    public int solve(String A) {

        int n = A.length();
        int count=0;
        for(int i=0; i<n;i++)
        {
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' ||
                    A.charAt(i)=='o' || A.charAt(i)=='u' || A.charAt(i)=='A' ||
                    A.charAt(i)=='E' || A.charAt(i)=='I' || A.charAt(i)=='O' ||
                    A.charAt(i)=='U')
            {
                count=count+(n-i);
                count=count%10003;
            }

        }
        return count;
    }
}
