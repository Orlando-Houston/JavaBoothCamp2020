package decisionStatement;

public class JobApplication {
    public static void main(String[] args) {
        int age=28;
        int javaPoint=95;
        double score=0;
        if ((age>=20&&age<=30) &&javaPoint>=80){
            score=age*1.5+javaPoint*4.5;
        }
        else if ((age>=20&&age<=30) &&javaPoint<80){
            score=age*1.5+javaPoint*3.5;
        }
        else if (age>30&&javaPoint>=80){
            score=age*1.1+javaPoint*4.5;

        }
        else if (age>=31&&javaPoint<80){
            score=age*1.1+javaPoint*3.5;
        }
        else{
            System.out.println ("Your age is not acceptable for this job");
        }
        System.out.println ("Your score is:"+score);


    }}




