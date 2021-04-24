package decisionStatement;
/*Ask user to calculate different shapes perimeter. Shapes;
Circle (input must be "C")
Request radius and calculate perimeter : 2 * 3.14 * radius
Rectangle (input must be "R")
Request width and height and calculate perimeter : 2 * ( h + w)
Triangle (input must be "T")
Request edges and calculate perimeter: e1 + e2 + e3
*/

import java.util.Scanner;


public class Perimeters {
    public static void main(String[] args) {
        Scanner scanPerimeter= new Scanner(System.in);
        System.out.println("C for circle, R for rectangle,T for Triangle");
        String shape=scanPerimeter .next();
        double perimeter=0;
        if (shape.equals("C")){
            System.out.print("Please enter radius");
            int radius=scanPerimeter.nextInt();
            perimeter=2*3.14;
        }
        else if (shape.equals("R")){
            System.out.print("Please weight");
            int weight=scanPerimeter.nextInt();
            int height=scanPerimeter.nextInt();
            perimeter=2*(weight+height);
        }
        else if (shape.equals("T")){
            System.out.println("Side1");
            int side1=scanPerimeter.nextInt();
            System.out.println("Side2");
            int side2=scanPerimeter.nextInt();
            System.out.println("Side3");
            int side3=scanPerimeter.nextInt();
            perimeter=side1+side2+side3;
        }
        else{
            System.out.println("Please enter C,R,T");
        }
        System.out.println("please enter is:"+perimeter);
    }
}
