package patterns;

import java.util.Scanner;

public class SimpleSample5 {
    //kullanicinin sisteme girdigi 3 sayinin hangisinin buyuk oldugunu bulunuz

    public static void main(String[] args) {

        int x,y,z;

        System.out.println("Enter 1.value");
        Scanner scan=new Scanner(System.in);
        x=scan.nextInt();

        System.out.println("Enter 2.Value");
        y=scan.nextInt();

        System.out.println("Enter 3. Value");
        z=scan.nextInt();


        if (x>y && x>z) {
            System.out.println("Max value 1.number");
        }
        else if (y>z&&y>z)

            System.out.println("max value2.number");


        else if (z>x&&z>y)

            System.out.println("Max value 3.number");


        else
            System.out.println("Invalid anumber");
    }
}
