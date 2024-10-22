package OldStuff;

import java.util.*;
public class Mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num > 0){
            num = num % 23;
            System.out.println(num);
        } 
    }
}
