package by.javatr.task2.util;

import by.javatr.task2.exception.NoMonthException;

public class Util {

    public static boolean isLeapYear(int year) {
        int changeYear = 1583;
        if (year >= changeYear) {
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }

        return year % 4 == 0;
    }
//    Где changeYear - это год, когда юлианский календарь становится Григорианским календарем (1582).
//
//    В юлианском календаре указывается високосный год каждые четыре года, тогда как Григорианский календарь пропускает века, которые не делятся на 400.

    public static String determineMonth(int number) throws NoMonthException {
        String month;
        switch (number) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                throw new NoMonthException("no such month");
        }
        return month;
    }
}
