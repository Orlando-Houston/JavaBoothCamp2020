package decisionStatement;
/*Problems
Calculate job applicant's score according to rules given
Age between 20 30 and Java point >= 80 : age * 1.5 + Java point * 4.5
Age between 20 30 and Java point < 80 : age * 1.5 + Java point * 3.5
Age 31 above and Java point >= 80 : age * 1.1 + Java point * 4.5
Age 31 above and Java point < 80 : age * 1.1 + Java point * 3.5
 */

public class JavaScore {
    public static void main(String[] args) {
        int age=49;
        int javaScore=81;
        double javaPoint=0;
        if (age>=20&&age<30&&javaScore>=80){

            javaPoint=age*1.5+javaScore*4.5;
            System.out.println("Your score Is"+javaPoint);
        }
        else if (age>=20&&age<30&&javaScore<80){
            javaPoint=age*1.5+javaScore*3.5;
            System.out.println("Your score is"+javaPoint);

        }
        else if (age>30&&javaScore>=80){
            javaPoint=age*1.1+javaScore*4.5;
            System.out.println("Your score is"+javaPoint);

        }
        else if (age>30&&javaScore<80) {
            javaPoint = age * 1.1 + javaScore * 3.5;
            System.out.println("Your score is" + javaPoint);
        }
        else {
            System.out.println();
        }


    }
}
