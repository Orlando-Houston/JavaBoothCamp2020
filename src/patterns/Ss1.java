package patterns;

import java.util.Scanner;

public class Ss1 {
    //kullanicinin girece[i 3 adet sinav notunu alip bu 3 sinavinortalamasinin hesaplayipX<50 den kaldi/x>50 gecti


    public static void main(String[] args) {
        int not;
        System.out.println("Please enter exam grade");
        Scanner scan=new Scanner (System.in);

        not=scan.nextInt();

        if (not<50){
            System.out.println("Fail the course");
        }
        else{
            System.out.println("PASS");
        }

    }
}
