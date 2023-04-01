/*
* Problem Description
You are given a string A of size N. Return the string A after reversing the string word by word.

* NOTE:
A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.

* Problem Constraints
  1 <= N <= 3 * 105

* Input  : A = "the sky is blue"
* Output : "blue is sky the"

* Explanation : We reverse the string word by word so the string becomes "blue is sky the".
*  TC : O(N^2)
*  SC : O(1)
* */
package strings;

public class ReverseWords {

    public String solve(String A) {

        char[] strarray = A.toCharArray();
        int start = 0;
        for(int end=0; end<strarray.length;end++)
        {

            if(strarray[end]==' ')
            {
                reverse(strarray,  start,  end);
                start=end+1;

            }

        }

        //reverse last word
        reverse(strarray,  start,  strarray.length-1);

        //reverse entire String
        reverse(strarray,  0,  strarray.length-1);

        return  String.valueOf(strarray).trim();
    }
    public static void reverse(char []str, int start, int end)
    {

        while(start<=end)
        {
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }

    }
}
