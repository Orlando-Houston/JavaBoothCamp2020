package patterns;

public class BelowTriangle1 {
    public static void main(String[] args) {
        int rowCounter = 5 ,numb=1 ,max=5;
        for (int i = 1; i <= rowCounter; i++)   //loop1
        {
            System.out.println();
            for (int j=1;j<=max ;j++)
            {

                System.out.print(numb);
                numb++;
            }
            numb=i+1;
            max--;


        }


    }
}
