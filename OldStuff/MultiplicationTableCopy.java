package OldStuff;

public class MultiplicationTableCopy {
    public static void main(String[] args) {
        int numbers = 10;
        for (int i = 0; i <= numbers; i++) {
            System.out.print((i == 0 ? "x\t|\t" : i + "\t|"));
            for (int j = 0; j <= numbers; j++)
                System.out.print((i == 0 ? (j == 0 ? "" : j + "\t") : (j >= i ? i * j + "\t" : "\t")));
            System.out.println();
        }
    }
}