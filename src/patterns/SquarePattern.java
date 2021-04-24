package patterns;

public class SquarePattern {
    //outer loop to print each of the rows
    public static void main(String[] args) {
        for (int row=1; row<=5; row++){           //row=1,2,3,....size
            //inner loop to print each ofvthe columns ofvthe particular row
            for (int col=1;col<=5; col++){
                System.out.print(" # ");//use print() without newline inside the inner loop

            }
            //print a newline after printing all the columns
            System.out.println();

        }
    }
}
