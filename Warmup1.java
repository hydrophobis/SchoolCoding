import java.util.Scanner;

public class Warmup1 {
    public static Scanner scanner = new Scanner(System.in);

    public static int check1(int odd){
        if(odd % 2 == 0){
            return 1;
        } else {
            return 0;
        }
    }
    public static void check2(int num){
        int tries = 2;
        int number = num;
        do {
            System.out.println("Negative num or larger than 100 " + "(" + tries + " tries left): ");
            num = scanner.nextInt();
            tries--;
        } while(!(number > 0 && number < 101));
    }
    public static void main(String[] args) {
        System.out.println("Odd: ");
        check1(scanner.nextInt());

        System.out.println("Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Negative num or larger than 100 " + "(3 tries left): ");
        check2(scanner.nextInt());

    }
}
