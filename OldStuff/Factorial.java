package OldStuff;

public class Factorial {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(factorial(num));
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int count = 0;
        while(count < n){
            n *= n - count;
            count += 1;
        }
        return n;
    }
}
