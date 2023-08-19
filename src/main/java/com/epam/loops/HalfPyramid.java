package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i >= n - j - 1 ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
