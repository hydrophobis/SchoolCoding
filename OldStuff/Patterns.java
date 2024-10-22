package OldStuff;

public class Patterns {
    public static void main(String[] args) {
        String row = "", row0 = "", row1 = "";
        int numF = 20, numH = 7, numG = 0;
        for(int i = 0; i < 9; i++)
            System.out.println("0\t1");
        System.out.println();
        for (int i = 0; i < 10; i++){
            row0 += "0 ";
            row1 += "1 ";
        }
        System.out.println(row0.trim() + "\n" + row1.trim() + "\n"); 
        for(int i = 0; i < 4; i++)
            System.out.println("0\t" + i + "\t" + (i * 2) + "\t" + (i * 3) + "\n");
        for (int i = 9; i > 0; i--)
            row += i + "\t";
        for (int j = 0; j < 4; j++)
            System.out.println(row.trim());
        System.out.println();
        for(int i = 0; i < 4; i++)
            System.out.println("a\ta\t" + (i < 4 ? "a\t" : "") + (i < 3 ? "a\t" : "") + (i < 2 ? "a\t" : ""));
        System.out.println();
        for(int i = 0; i < 5; i++)
            System.out.println((numF + (i * 2)) + "\t" + (i < 4 ? (numF + (i * 2)) + 1 : "").toString() + "\t" + (i < 3 ? (numF + (i * 2)) + 1 : "") + "\t" + (i < 2 ? (numF + (i * 2)) + 1 : "") + "\t" + (i < 1 ? (numF + 4) : ""));
        System.out.println();
        for(int i = 0; i < 4; i++)
            System.out.println(numG + "\t" + (i > 0 ? (i + "\t") : "").toString() + (i > 1 ? (i * 2) + "\t" : "") + (i > 2 ? (i * 3) + "\t" : "") + (i > 3 ? (i * 4) + "\t" : "") + "A");
        System.out.println();
        for(int i = 0; i < 3; i++)
            System.out.println(numH + "\t" + (numH + (i * 4)) + "\t" + (numH + (i * 8)) + "\t" +(i == 0 ? ":)" : numH + (i * 12)) + "\t" + (i == 0 ? "" : (i == 1 ? ":)" : numH + (i * 16))) + "\t" + (i == 0 || i == 1 ? "" : (i == 2 ? ":)" : numH + (i * 20))) + "\t");
    }
}