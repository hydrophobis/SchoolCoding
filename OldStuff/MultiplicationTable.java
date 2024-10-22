package OldStuff;

public class MultiplicationTable {
    public static String firstRow = "";
    public static String triangle = "";
    public static void main(String[] args) {
        int numbers = 10;
        for(int i = 0; i < numbers + 1; i++){
            for(int k = 0; k < numbers; k++){
                firstRow = firstRow + ((k + 1) + "\t ");
            }
            System.out.print((i == 0 ? ("x\t|\t " + firstRow) : i + "\t|\t"));
            triangle = "";
            for(int l = 0; l < (i - 1); l++){
                triangle = triangle + "\t";
            }
            System.out.print(triangle);
            for(int j = 0; j < numbers + 1; j++){
                System.out.print((i * j == 0 ? "" : (j >= i ? " " + i * j  + " \t" : "")));
            }
            System.out.println();
        }
    }
}