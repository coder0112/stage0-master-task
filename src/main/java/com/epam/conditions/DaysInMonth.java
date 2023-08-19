package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month > 12 || year < 0 || month < 0) {
            System.out.println("invalid date");
            return;
        }
        int d = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 :
                d = 31;
                break;
            case 4, 6, 9, 11 :
                d = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    d = 29;
                } else {
                    d = 28;
                }
                break;
        }
        System.out.println(d);
    }

}
