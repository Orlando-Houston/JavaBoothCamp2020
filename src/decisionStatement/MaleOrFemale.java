package decisionStatement;
/*Request user's gender male as "M" and "F" as female. According to
answer print Male or Female.
PS : They will not match since "==" does not compare
To com pare contetnt use "equals"
*/

import javax.swing.*;
import java.util.Scanner;


public class MaleOrFemale {
    public static void main(String[] args) {
        //class/object   empyty
        Scanner sex = new Scanner(System.in);
        System.out.println("Please enter F or M");
        String gender = sex.next();
        if (gender.equals ("m")) {                      //gender==male
            System.out.println("Male");
        }
        else {
            System.out.println("F");
        }

    }


}
