package Arrays;

public class Exception3 {
    public static void main(String[] args){
        int pay=15;
        int payda=0;

        try {
            int bolme=pay/payda;
        }
        catch(Exception i) {
            System.err.println("Programda bir hata var,tekrar kontrol ediniz..: " + i);
        }
    }
}
