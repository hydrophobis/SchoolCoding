package OldStuff;

import java.util.Scanner;
public class College {
    public static void main(String args[]){
        int rate;
        System.out.println("Credit Hours(number): \nUndergrad(y/n): \nOut of state(y/n): \nParking(y/n): \nMonthly installments(y/n): ");
        int creditHours = new Scanner(System.in).nextInt();
        //new Scanner(System.in).nextLine();
        char undergrad = new Scanner(System.in).nextLine().charAt(0); 
        if(undergrad != 'y' && undergrad != 'n')
            System.exit(1);
        char outOfState = new Scanner(System.in).nextLine().charAt(0); 
        if(outOfState != 'y' && outOfState != 'n')
            System.exit(1);
        char parking = new Scanner(System.in).nextLine().charAt(0); 
        if(parking != 'y' && parking != 'n')
            System.exit(1);
        char monthly = new Scanner(System.in).nextLine().charAt(0); 
        if(monthly != 'y' && monthly != 'n')
            System.exit(1);
        if(undergrad == 'y')
            if(outOfState == 'y')
                rate = 675;
            else 
                rate = 450;
        else
            if(outOfState == 'y')
                rate = 950;
            else
                rate = 700;          
        if(parking == 'y')
            rate += 40;
        System.out.println("Your cost will be " + (monthly == 'y' ? (Math.round(rate * creditHours / 12.0 * 1.08) + "$ and " + (rate * creditHours * 1.08) + "$ total") : (rate * creditHours)) + (monthly == 'y' ? "" : "$") + (monthly == 'y' ? " monthly" : ""));
    }
}