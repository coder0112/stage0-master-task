package com.epam.loops;

public class Power {

    public void printPower(int n, int p) {
        long s = 1;
        for (int i = 0; i < p; i++) {
            s *= n;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
