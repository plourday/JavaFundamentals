package com.andrew.codingpractice.section_3_21;

/*
*  Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
*  Formula : h = ( q + (26(m + 1) / 10) + k (k / 4) + (j / 4) + 5j) % 7
*  h is day of the week : 0: Saturday 1: Sunday, 2: Monday etc. 
*  n = day of the week
*  q is day of the month
*  m is the month January and February counted as months 13 and 14 respectively of the previous year.
*  j = year / 100
*  k is the year of the century i.e year % 100
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year.");
        int year = scanner.nextInt();
        System.out.println("Please enter the month. (1-12)");
        int month = scanner.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("Invalid input. Must be 1-31.");
            System.exit(0);
        }
        System.out.println("Please enter the day of the month.(1-31)");

        int dayOfMonth = scanner.nextInt();
        if (dayOfMonth > 31 || dayOfMonth < 1) {
            System.out.println("Invalid Input, must be 1-31.");
            System.exit(0);
        }
        boolean leapYear;
        if (year % 4 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        scanner.close();
        switch (month) {
            case 0:
                System.out.println("Invalid input. Must be 1-12.");
                System.exit(0);
            case 2:
                if (leapYear && dayOfMonth >= 30) {
                    System.out.println("Invalid input, year is leapyear and day cannot be greater than 29");
                    System.exit(0);

                } else if (!leapYear && dayOfMonth > 28) {
                    System.out.println("Invalid input,  Not a leapyear - There are not more than 28 days in February.");
                    System.exit(0);
                } else {
                    break;
                }
            case 4:
                if (dayOfMonth > 30)
                    System.out.println("Invalid input, There are not more than 31 days in April.");
                System.exit(0);
            case 6:
                if (dayOfMonth > 30)
                    System.out.println("Invalid input, There are not more than 31 days in June.");
                System.exit(0);
            case 9:
                if (dayOfMonth > 30)
                    System.out.println("Invalid input, there are not more than 31 days in September.");
                System.exit(0);
            case 11:
                if (dayOfMonth > 30)
                    System.out.println("Invalid input, There are not more than 31 days in November.");
                System.exit(0);

        }

        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }

        int j = year / 100;
        int k = year % 100;

        int dayOfWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Day of the week is Saturday");
                break;
            case 1:
                System.out.println("Day of the week is Sunday");
                break;
            case 2:
                System.out.println("Day of the week is Monday");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is Thursday");
                break;
            case 6:
                System.out.println("Day of the week is Friday");
                break;
        }

    }
}
