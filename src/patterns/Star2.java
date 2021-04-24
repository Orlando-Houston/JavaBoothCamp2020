package patterns;

public class Star2 {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 4; i++) {                                       //nested for loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();


    }
}
