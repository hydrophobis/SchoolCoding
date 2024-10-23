package U2Proj;

import java.util.Scanner;

public class YearCalendar {
    public static final String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first day of the month (e.g., Mon): ");
        String firstDay = scanner.nextLine().trim();
        System.out.println("Enter the number of days in the month: ");
        int monthLength = scanner.nextInt();

        for(int f = 0; f < 12; f++){
            System.out.println("\n" + month[f]);



            int dayOffset = -1;
            for (int i = 0; i < week.length; i++) {
                if (week[i].equalsIgnoreCase(firstDay)) {
                    dayOffset = i;
                    break;
                }
            }

            // Day labels
            for (String day : week) {
                System.out.print(day + "\t");
            }
            System.out.println();

            // Spaces for frst week
            for (int i = 0; i < dayOffset; i++) {
                System.out.print("\t");
            }

            int dayCounter = 1;

            // 1st week
            for (int i = dayOffset; i < 7; i++) {
                if (dayCounter <= monthLength) {
                    System.out.printf("%d\t", dayCounter++);
                }
            }
            System.out.println();

            // Other week
            while (dayCounter <= monthLength) {
                for (int i = 0; i < 7 && dayCounter <= monthLength; i++) {
                    System.out.printf("%d\t", dayCounter++);
                }
                System.out.println();
            }
        }

    }
}
