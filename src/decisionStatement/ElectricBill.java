package decisionStatement;

public class ElectricBill {
    public static void main(String[] args) {
        int amountKw=400;
        double bill=0;
        if (amountKw<500){
            bill=amountKw*0.3;
            System.out.println("you will bill pay"+bill);

        }
        else if (amountKw>=500&&amountKw<1000){
            bill=amountKw*0.4;
            System.out.println("You will bill pay "+bill);
        }
        else if (amountKw>=1000&&amountKw<2000){
            bill=amountKw*0.5;
            System.out.println("You will bill pay "+bill);
        }
        else{
            bill=amountKw*0.8;
            System.out.println("You will bill pay"+bill);
        }
    }
}
