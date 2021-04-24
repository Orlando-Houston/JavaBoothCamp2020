package decisionStatement;

public class TriangleCheking {
    public static void main(String[] args) {
        int side1=100;
        int side2=120;
        int side3=140;
        if (side1+side2>side3&&side2+side3>side1&&side3+side1>side2){
            System.out.println("These sides can form a triangle");
        }
        else {
            System.out.println("sorry");
        }
    }
}
