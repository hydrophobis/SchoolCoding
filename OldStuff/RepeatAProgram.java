package OldStuff;

import java.util.*;
public class RepeatAProgram {
    public static void main(String[] args) {
        Scanner[] scanners = new Scanner[10000000];
        int iterator = 0;
        while(true){
            scanners[iterator] = new Scanner(System.in);
            System.out.println(scanners[iterator]);
            iterator++;
        }
    }
}