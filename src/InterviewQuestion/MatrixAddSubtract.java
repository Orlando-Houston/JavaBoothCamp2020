package InterviewQuestion;

import java.util.Scanner;

public class MatrixAddSubtract {
    public static int[][] read(Scanner number, int rows, int columns){
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println("Enter value of [" + (i + 1) + "][" + (j + 1) + "]");
                matrix[i][j] = number.nextInt();
            }
        }
        return matrix;
    }
    public static int[][] add(int[][] a, int[][] b){
        int rows = a.length;
        int columns = a[0].length;
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrix;
    }
    public static int[][] subtract(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = a[i][j] - b[i][j];
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type number of rows: ");
        int rows = input.nextInt();
        System.out.println("Type number of columns: ");
        int columns = input.nextInt();
        System.out.println("Please type 1st matrix: ");
        int[][] a = read(input, rows, columns);
        System.out.println();
        System.out.println("Please type 2nd matrix: ");
        int[][] b = read(input, rows, columns);
        System.out.println();
        int[][] sum = add(a, b);
        int[][] difference = subtract(a, b);

        System.out.println("The sum of two matrices is: ");
        printMatrix(sum);
        System.out.println("The difference between two matrices is: ");
        printMatrix(difference);
    }
}
