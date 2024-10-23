package U2Proj;

import java.util.Scanner;

public class YearCalendar {
    public static final String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static final int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first day of the year (e.g., Mon): ");
        String firstDay = scanner.nextLine().trim();

        int dayOffset = -1;
        for (int i = 0; i < week.length; i++) {
            if (week[i].equalsIgnoreCase(firstDay)) {
                dayOffset = i;
                break;
            }
        }

        if (dayOffset == -1) {
            System.out.println("Invalid day entered.");
            return;
        }

        for (int f = 0; f < 12; f++) {
            System.out.println("\n" + month[f]);

            for (String day : week) {
                System.out.print(day + "\t");
            }
            System.out.println();

            for (int i = 0; i < dayOffset; i++) {
                System.out.print("\t");
            }

            int dayCounter = 1;
            int currentMonthLength = monthLength[f];

            for (int i = dayOffset; i < 7 && dayCounter <= currentMonthLength; i++) {
                System.out.printf("%d\t", dayCounter++);
            }
            System.out.println();

            while (dayCounter <= currentMonthLength) {
                for (int i = 0; i < 7 && dayCounter <= currentMonthLength; i++) {
                    System.out.printf("%d\t", dayCounter++);
                }
                System.out.println();
            }

            dayOffset = (dayOffset + currentMonthLength) % 7;
        }
    }
}
