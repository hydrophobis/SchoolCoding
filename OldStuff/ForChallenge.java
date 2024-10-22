package OldStuff;

public class ForChallenge {
    public static void main(String[] args){
        int num = 28;
        num += 7;
        for(int i = 0; i < num / 2 + 1; i += 7){
            for(int j = 1; j < num / 4 + 1; j++)
                System.out.print(i + j + "\t");
            System.out.println();
        }
    }
}