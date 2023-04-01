/*
* Problem Description
You are given a string A of size N consisting of lowercase alphabets.You can change at most B
characters in the given string to any other lowercase alphabet such that the number of distinct
characters in the string is minimized.Find the minimum number of distinct characters in the resulting
string.

* Problem Constraints
1 <= N <= 100000
0 <= B < N

* Input
A = "abcabbccd"
B = 3

* Output : 2

* TC : O(NLogN)
* SC : O(N)
* */
package strings;

import java.util.Arrays;

public class ChangeCharacter {
    static int solve(String A, int B) {
        int [] pf= new int[26];
        for(int i=0;i<A.length();i++)
        {
            int index = (A.charAt(i))%97;
            pf[index]+=1;
        }

        Arrays.sort(pf);
        int ans=0;
        for(int i=0;i<26;i++)
        {
            if(pf[i]!=0)
            {
                if( B>=pf[i])
                {
                    B=B-pf[i];
                    pf[i]=0;
                }
                else
                    ans++;

            }
        }
        return ans;
    }
}
