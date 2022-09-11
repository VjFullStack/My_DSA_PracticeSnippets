/*
* Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.
*
* Problem Constraints
1 <= A <= 10^9
*
* Input : 11
*
* Output : 3
*
* TC : O(1)
* SC : O(1)
* */
package bitmanipulation;

public class NumberOfSetBits {

    public int setBits(int A)
    {       int count=0;
       while(A!=0) {
          if ((A& 1) == 1)
                count++;
            A=A>>1;
       }
        return count;
    }

}
