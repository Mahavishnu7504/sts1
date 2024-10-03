public class LeapYearCheck {

    public static boolean isLeapYear(int year) {

        // If the year is divisible by 400, it's a leap year
        
        if (year % 400 == 0) {
            return true;
        }

        // If the year is divisible by 100 but not 400, it's not a leap year
        
        if (year % 100 == 0) {
            return false;
        }

        // If the year is divisible by 4 but not 100, it's a leap year
        // Otherwise, it's not a leap year

        return year % 4 == 0;

    }

    public static void main(String[] args) {
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
