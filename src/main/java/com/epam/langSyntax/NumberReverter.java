package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int n) {
        int m = 0;
        while (n != 0) {
            m = m * 10 + n % 10;
            n /= 10;
        }
        System.out.println(m);
    }

}
