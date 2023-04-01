/*
* Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).

* Problem Constraints
1 <= N <= 6000

*  Input : A = "aaaabaaa"

* Output : "aaabaaa"

*  Explanation : We can see that longest palindromic substring is of length 7 and the string is "aaabaaa"

* TC : O(N^2)
* SC : O(1)
* */
package strings;

public class LongestPalindromeSubString {

    public String solve(String A) {

        int n = A.length();

        String temp ="";
        for(int i=0;i<n;i++)
        {
            //A.charAt[i] is centre.
            //aaabbaaa
            int p1=i;
            int p2 =i;
            if(temp.length()<expand(A,p1,p2).length())
            {
                temp=expand(A,p1,p2);
            }

        }

        for(int i=0;i<n-1;i++)
        {

            //A.charAt[i] is centre.

            int p1=i;
            int p2 =i+1;
            if(temp.length()<expand(A,p1,p2).length())
            {
                temp=expand(A,p1,p2);
            }
        }

        return temp;

    }

    static String expand(String s , int p1, int p2)
    {
        while((p1>=0) && (p2<s.length()) && s.charAt(p1)==s.charAt(p2))
        {
            p1--;
            p2++;
        }


        return s.substring(p1+1,p2);

    }
}
