package patterns;

public class SquarePatternLoops {
    // outer loop to print each of the rows
    public static void main(String[] args) {
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 7; col++) {


                System.out.print("  *  ");
            }
            //print a newline after printing all the columns
            System.out.println();
        }

    }
}
