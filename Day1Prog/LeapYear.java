package Training;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner leap = new Scanner(System.in);
        System.out.println("enter a number:");
        int year = leap.nextInt();
        if (year < 1000 || year > 9999) {
            System.out.println("Enter a valid string");
        } else if (year % 4 == 0) {
            System.out.println("year is leap year");
        } else {
            System.out.println();
        }
    }
}





