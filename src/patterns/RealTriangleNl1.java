package patterns;

public class RealTriangleNl1 {
    public static void main(String[]args) {
        int rowCount=5,i,j,max=1,numb;
        for (i=1;i<=rowCount;i++)//LOOP1
        {
            System.out.println();
            numb=1;
            for (j=1;j<=max;j++) //LOOP2
            {
                System.out.print(numb);
                numb++;
            }
            max++;
        }

    }
}
