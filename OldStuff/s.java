package OldStuff;

import java.util.Scanner;
public class s {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        String character = new Scanner(System.in).nextLine();
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++)
                System.out.print(" " + character + " ");
            System.out.println();
        }
    }
}