import java.util.Scanner;
public class SwitchExample {

    public static void main(String[] args) {
        try (Scanner sca = new Scanner(System.in)) {
            System.out.println("enter day: ");
            int day = sca.nextInt();

            String dayName;
            
            switch (day) {
                case 1:
                dayName = "Sunday";
                break;
                case 2:
                    dayName = "Monday";
                    break;
                case 3:
                    dayName = "Tuesday";
                    break;
                case 4:
                    dayName = "Wednesday";
                    break;
                case 5:
                    dayName = "Thursday";
                    break;
                case 6:
                    dayName = "Friday";
                    break;
                case 7:
                    dayName = "Saturday";

                    break;
                default:
                    dayName = "Invalid day";
                    break;
            }

            System.out.println("Good Day: " + dayName);
        }
    }
}
