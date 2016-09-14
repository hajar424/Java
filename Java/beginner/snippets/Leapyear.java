/**
 * Created by hajar on 2016-09-09.
 */

/*
Info about a leap year
*A year is equal to 365.25 days
* We can't have a 1/4 of a day (25%), we count days as a whole number.
* (1/4) + (1/4) + (1/4) + (1/4) = 4/4 = 1 (whole number)
* each 4th year a new day is added, 4/4 = 1 day, whole number.
* 4 years*0.25days = 1 day
* So every 4th year a new day is added.
*/


public class Leapyear {

    public static void main(String[] args) {

        int year = 45;
        System.out.println(year%4);
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
        else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }

}
