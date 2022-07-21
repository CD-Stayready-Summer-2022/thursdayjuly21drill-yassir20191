package com.codedifferently.drillz;

import java.util.ArrayList;

public class Problem01 {

    /**
     * Given two non-negative int values,
     * return true if they have the same last digit,
     * such as with 27 and 57.
     * Note that the % "mod" operator computes remainders,
     * so 17 % 10 is 7.
     * lastDigit(7, 17) → true
     * lastDigit(6, 17) → false
     * lastDigit(3, 113) → true
     * @param a
     * @param b
     * @return
     */
    public boolean lastDigit(int a, int b) {

        String holder1 = String.valueOf(a);
        String holder2 = String.valueOf(b);

        int int1 = holder1.charAt(holder1.length()-1);
        int int2 = holder2.charAt(holder2.length()-1);

        return int1%int2 == 0;


    }
}
