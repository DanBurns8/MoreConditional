package com.company;

public class MoreConditionals {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2){
        if(year2<year1){
            return true;
        }else if (year1<year2){
            return false;
        }else if (month2<month1){
            return true;
        }else if (month1<month2){
            return false;
        }else if (day2<day1){
            return true;
        }else if (day1<day2){
            return false;
        } else{
            return false;
        }
    }

    public static int findBestFit(int size1, int size2, int space) {
        if (size1 + size2 <= space) {
            return 3;
        }  else if(size1+size2>space) {
            return 0;
        }else if (space - size1 > size2) {
            return 1;
        } else if (space - size2 > size1) {
            return 2;
        }
    }
        public static void main (String[]args){
            // leap year
            System.out.println("2000 " + isLeapYear(2000));
            System.out.println("2004 " + isLeapYear(2004));
            System.out.println("2003 " + isLeapYear(2003));
            System.out.println("2100 " + isLeapYear(2100));
            // is later
            System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
            System.out.println("1/2/2011 is later than 1/2/2010 " + isLater(1,2,2011, 1,2,2010));
            System.out.println("1/5/2010 is later than 3/2/2010 " + isLater(1,5,2010, 3,2,2010));
            System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));
            System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
            System.out.println("1/2/2010 is later than 1/3/2010 " + isLater(1,2,2010, 1,3,2010));
            System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));
            System.out.println("4/8/2010 is later than 1/2/2011 " + isLater(4,8,2010, 1,2,2011));
            // Best Fit
            System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
            System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
            System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
            System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
            System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
            System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));
    }
}



//// Make Bench
//System.out.println("Make bench 3 1 8 is " + makeBench(3,1,8));
//System.out.println("Make bench 3 1 9 is " + makeBench(3,1,9));
//System.out.println("Make bench 11 1 15 is " + makeBench(11,1,15));
//System.out.println("Make bench 4 2 15 is " + makeBench(4,2,15));
//System.out.println("Make bench 20 0 20 is " + makeBench(20,0,20));
//System.out.println("Make bench 3 4 20 is " + makeBench(3,4,20));
//System.out.println("Make bench 0 6 30 is " + makeBench(0,6,30));
//System.out.println("Make bench 0 5 30 is " + makeBench(0,5,30));
//System.out.println("Make benches 2 6 23 is " + makeBenches(2,6,23));
