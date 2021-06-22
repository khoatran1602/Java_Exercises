//Main.java
package com.exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Check check = new Check();
        String month,
                year;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter a year: ");
            year = input.nextLine();
            if (check.checkYear(year)) {
                break;
            } else {
                System.out.println("Please enter a gain");
            }
        }
        while (true) {
            System.out.printf("Enter a month: ");
            month = input.nextLine();
            if (check.checkMonth(month)) {
                break;
            } else {
                System.out.println("Please enter a gain");
            }
        }
        check.display(month, year);
    }
}

//Check.java
package com.exercises;

import java.util.Scanner;

public class Check {
    public boolean checkYear(String year) {
        if (year.matches("^[a-zA-Z]*$")) {
            return false;
        }
        return true;
    }

    public boolean checkMonth(String month) {
       if (month.length() < 4 && Character.isUpperCase(month.charAt(0))) {
           return true;
       }
       return false;
    }

    public boolean checkLeapYear(String year) {
        int leapYear = Integer.parseInt(year);
        if (leapYear % 4 == 0 || leapYear % 100 == 0 || leapYear % 400 == 0) {
            return true;
        }
        return false;
    }

    public void display(String month, String year) {
        if (!month.equals("Feb")) {
            switch (month) {
                case "Jan":
                case "Mar":
                case "May":
                case "Jul":
                case "Aug":
                case "Oct":
                case "Dec":
                    System.out.println(month + " "  + year + " has 31 days");
                    break;
                case "Apr":
                case "Jun":
                case "Sep":
                case "Nov":
                    System.out.println(month + " "  + year + " has 30 days");
                    break;
            }
        }else {
            if (checkLeapYear(year)) {
                System.out.println(month + " "  + year + " has 29 days");
            } else {
                System.out.println(month + " "  + year + " has 28 days");
            }
        }
    }
}
