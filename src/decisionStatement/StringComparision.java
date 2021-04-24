package decisionStatement;

public class StringComparision {
    public static void main(String[] args) {
        String check1="A";//a
        String check2="a";
        System.out.println(check1.compareTo(check2));
        if (check1.compareTo(check2)==0){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }
    }
}
