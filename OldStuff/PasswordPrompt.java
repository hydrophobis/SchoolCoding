package OldStuff;

import java.util.Scanner;

public class PasswordPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Password: ");
        String guess = "0";
        String password = "hello";
        while (!guess.toString().equals(password)) {
            guess = scanner.nextLine();
            if(!guess.toString().equals(password))
                System.out.println("Yourruere'reour wrong");
        }
        scanner.close();
        return;
    }

    public static String 𒐫(){
        return "𒐫";
    }
}
