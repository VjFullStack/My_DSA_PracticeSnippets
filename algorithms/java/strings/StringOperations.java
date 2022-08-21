/*
* Problem Description
Akash likes playing with strings. One day he thought of applying following operations on the string
in the given order:
    Concatenate the string with itself.
    Delete all the uppercase letters.
    Replace each vowel with '#'.
    You are given a string A of size N consisting of lowercase and uppercase alphabets.
    Return the resultant string after applying the above operations.
    NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.

* Problem Constraints
1<=N<=100000

*  Input : A="AbcaZeoB"
*  Output: "bc###bc###"
* TC : O(N)
* SC : O(1)
* */
package strings;

public class StringOperations {

    static String solve(String A) {


        //AbcaZeoB
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++)
        {
            if(!(A.charAt(i)>=65&& A.charAt(i)<=90))
            {
                if(A.charAt(i) =='a'|| A.charAt(i) =='e'|| A.charAt(i) =='i'||A.charAt(i) =='o'||A.charAt(i) =='u')
                    sb.append('#');
                else
                    sb.append(A.charAt(i));
            }

        }
        return sb.append(sb.toString()).toString();
    }

}
