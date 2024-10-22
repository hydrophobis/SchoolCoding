package OldStuff;

import java.util.*;
public class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(33423424);

        int len = random.nextInt(75);
        String word = "";
        for(int i = 0; i < len; i ++){
            word += (char)(random.nextInt(26) + 97);
        }


        int guesses = 6;
        boolean guessed = false;
        while(!guessed){
            System.out.println(word);
            guessed = true;
        }

        scanner.close();
    }
}
