package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double a, double b, double c) {
        System.out.println((a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0) ?
                "this is a valid triangle" : "it's not a triangle");
    }

}
