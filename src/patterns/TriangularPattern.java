package patterns;

public class TriangularPattern {
    public static void main(String[] args) {
        for (int row=1;row<=8; row++){
            for (int col=1; col<=8; col++){
                if (row +col <=8){
                    System.out.print(" # ");
                }
                else{
                    System.out.print("    ");//need to print theb "leading" blanks
                }
            }
            //Print a newline after printing all the columns
            System.out.println();

            //on the main diagonal ,row=col.on the opposite diagonal,row+col=size+1


        }
    }
}
//if row+col>=size +1;print blank need to print the leading blanks



