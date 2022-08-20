/*Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.
*
*Problem Constraints
  1 <= len(A) <= 100000
  0 <= A[i] <= 2*10^9
*
Example Input : A = [3, 30, 34, 5, 9]

Example Output : "9534330"

* */
package sorting;

import java.util.Arrays;

public class LargestNumber {

    public String getLargestNumber(final int[] A) {

        String[] strArray = new String[A.length];

        // converting integer array to array of string
        for (int i = 0; i < A.length; i++) {
            strArray[i] = Integer.toString(A[i]);
        }


        Arrays.sort(strArray, (a, b) -> {
            String o1 = a + b;
            String o2 = b + a;
            return o2.compareTo(o1);
        });

        if(strArray[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();

        for (String s : strArray)
            sb.append(s);


        return sb.toString();
    }
}
