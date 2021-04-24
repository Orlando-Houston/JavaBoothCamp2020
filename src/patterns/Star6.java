package patterns;

public class Star6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {                                       //nested for loop
            for (int j = 1; j <= 4; j++) {
                System.out.print(i+j-1 + "");

            }
            System.out.println();

        }
        System.out.println();

    }
}
