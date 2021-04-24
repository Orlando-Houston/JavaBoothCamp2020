package patterns;

import java.util.Scanner;

public class SimpleSample6 {
    //faktoriyel deger
    public static void main(String[] args)
    {
        int x,a,fact = 1;

        System.out.println("Enter value:");
        Scanner scanner = new Scanner (System.in);
        x = scanner.nextInt();

        if (x < 0)
            System.out.println("you entered negative value");
        else
        {
            for (a = 1; a <= x; a++)
            {
                fact = fact * a;
            }
            System.out.println("Factorial value of your number:" + fact);
        }
    }
}
