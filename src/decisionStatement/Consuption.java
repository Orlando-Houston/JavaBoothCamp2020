package decisionStatement;

public class Consuption {
    public static void main(String[] args) {
        int consp=120;
        if (consp<500){
            System.out.println("you will pay $0.3 per kw");

        }
        else if (consp>=500&&consp<1000){
            System.out.println("You will pay $0.4 per kw");
        }
        else if (consp>=1000&&consp<2000){
            System.out.println("You will pay $0.5 per kw");
        }
        else{
            System.out.println("You will pay $ 0.6 per kw");
        }
    }
}
