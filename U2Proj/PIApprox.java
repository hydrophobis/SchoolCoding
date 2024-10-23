package U2Proj;

import java.util.Scanner;

public class PIApprox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double pi = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0) {
                pi += 1.0 / (2 * i + 1);
            } else {
                pi -= 1.0 / (2 * i + 1);
            }
            // System.out.println(pi * 4);

        }
        System.out.println("Final approx: " + (pi * 4));
    }
}
