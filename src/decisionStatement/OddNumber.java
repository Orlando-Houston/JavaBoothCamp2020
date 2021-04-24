package decisionStatement;

public class OddNumber {
    public static void main(String[] args) {
        int number=3435;
        int remainder=number%2;//modulus //sayi 2 ye bolununce kalan birse tek sayidir
        System.out.println(remainder);
        if (remainder==0){
            System.out.println("not odd number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
