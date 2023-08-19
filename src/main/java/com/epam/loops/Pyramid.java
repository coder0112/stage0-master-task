package com.epam.loops;

public class Pyramid {

    public void printPyramid(int n) {
        int m = 2 * n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < m; j++) {
                System.out.print(Math.abs(n - j) <= i - 1 ? Math.abs(n - j) + 1 : (j >= i + n) ? "" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
