package OldStuff;

import java.util.Scanner;
public class CollegeCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Credit Hours(number): \nUndergrad(y/n): \nOut of state(y/n): \nParking(y/n): \nMonthly installments(y/n): ");
        int creditHours = input.nextInt();
        char undergrad = input.next().charAt(0), outOfState = input.next().charAt(0), parking = input.next().charAt(0), monthly = input.next().charAt(0);
        if(undergrad != 'y' && undergrad != 'n' || outOfState != 'y' && outOfState != 'n' || 
            parking != 'y' && parking != 'n' || monthly != 'y' && monthly != 'n') System.exit(1);
        int rate = (undergrad == 'y' ? (outOfState == 'y' ? 675 : 450) : (outOfState == 'y' ? 950 : 700));
        if(parking == 'y') rate += 40;
            System.out.println("Your cost will be " + (monthly == 'y' ? (Math.round(rate * creditHours / 12.0 * 1.08) + "$ and " + (rate * creditHours * 1.08) + "$ total") : (rate * creditHours) + "$") + (monthly == 'y' ? " monthly" : ""));
    }
}