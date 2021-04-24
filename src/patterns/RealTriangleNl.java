package patterns;

public class RealTriangleNl {
    public static void main(String[] args) {
        int rowCount=5,i,j,max=1;
        for (i=1;i<=rowCount;i++)//LOOP1
        {
            System.out.println();
            for (j=1;j<=max;j++) //LOOP2
            {
                System.out.print("*");
            }
            max++;
        }

    }
}
