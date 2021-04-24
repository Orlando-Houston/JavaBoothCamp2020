package decisionStatement;

public class AgeExample1 {
    public static void main(String[] args) {
        int ageToCheck=1120;
        if (ageToCheck<0){
            System.out.println();
        }
        else if (ageToCheck>=120){
            System.out.println("Age can not be larger than 120");
        }
        else{
            System.out.println("Okey");
        }
    }
}
