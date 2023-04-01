/*
* Problem Description
Given two binary strings, return their sum (also a binary string).
*
* Example:
a = "100"
b = "11"
Return a + b = "111".
*
* TC : O(N)
* SC : O(N)
* */
package bitmanipulation;

public class AddBinaryStrings {

    public String addBinary(String A, String B) {

        StringBuilder sb = new StringBuilder();
        int tempa;
        int tempb;
        int carry=0;

        int i = A.length()-1;
        int j = B.length()-1;

        int endindex=j;
        if(A.length()>B.length())
        {endindex=i;}


        while( endindex>=-1)
        {
            if(i>=0)
            { tempa=  getOriginal(A.charAt(i));}
            else{tempa=0;}

            if(j>=0) {tempb = getOriginal(B.charAt(j));}
            else{tempb=0;}

            int res= (tempa+tempb+carry)%2;
            carry= (carry+tempa+tempb)/2;
            sb.append(String.valueOf(res));

            i--;
            j--;
            endindex--;
        }

        return sb.reverse().toString().replaceAll("^0+(?!$)","");
        //replaceAll("^0+(?!$)",""); this step is to remove leading zeros from the string.
    }

    public static int getOriginal(int temp)
    {
        if(temp==49)
            return 1;

        return 0;

    }
}
