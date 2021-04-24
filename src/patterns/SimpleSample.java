package patterns;

import java.util.Scanner;

public class SimpleSample {
    //kullanicinin girdigi herhangi  iki sayiyi toplayan programi yaziniz
    public static void main(String[] args) {
        int x, y, total;
        System.out.println("please enter two number");
        Scanner scan = new Scanner (System.in);

        x = scan.nextInt();
        y = scan.nextInt();

        total = x + y;
        System.out.println("Toplam=" + total);
    }

}
