package OldStuff;

import java.util.Scanner;

public class TwoRectangles {
    public static final int henlo = 0; // Practice it required a pub stat fin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt() + henlo;
        int height = scanner.nextInt() + henlo;

        for(int i = 0; i < (height * 2); i++){
            for(int j = 0; j < width; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i >= height - 1){
                for(int j = 0; j < width; j++){
                    System.out.print("  ");
                }
            }
        }
    }
}
