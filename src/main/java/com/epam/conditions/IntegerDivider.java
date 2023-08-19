package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }
        double d = dividend * 1. / divider;
        System.out.println(d - (int)d == 0 ? "can be divided completely" : "cannot be divided completely");
    }

}
