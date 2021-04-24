package patterns;

import java.util.Scanner;

public class Ss2 {
    //3 sinav notunun hesaplanmasi

    public static void main(String[] args) {

        int grade1;
        int grade2;
        int grade3;
        int average;
        System.out.println("Please enter exam grade");
        Scanner scan=new Scanner(System.in);

        grade1=scan.nextInt();
        grade2=scan.nextInt();
        grade3=scan.nextInt();
        average=(grade1+grade2+grade3)/3;

        System.out.println(average);

        if(average<50){
            System.out.println("Don't pass ");

        }
        else{
            System.out.println("PASS");

        }



    }
}
