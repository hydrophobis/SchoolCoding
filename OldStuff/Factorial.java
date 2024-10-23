package OldStuff;

public class Factorial {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int num = 4;
        System.out.println(factorial(num));
        long endTime = System.nanoTime();
        double duration = ((double)endTime - startTime) / 100;
        System.out.println("Done in " + duration + " mis");
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int count = 1;
        for(int i = 1; i <= n; i++){
            count *= i;
        }
        return n;
    }
}
