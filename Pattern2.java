public class Pattern2 {

    private static final int PATTERN_SIZE = 5;

    public static void main(String[] args) {

        for (int i = 1; i <= PATTERN_SIZE; i++) {
            printRow(i);
        }
    }

    private static void printRow(int row) {

        for (int s = row; s < PATTERN_SIZE; s++) {
            System.out.print("  ");
        }

        

        for (int j = 1; j <= row; j++) {
            System.out.print(j + " ");
        }

        for (int j = row - 1; j >= 1; j--) {
            System.out.print(j + " ");
        }

        System.out.println();
    }
}