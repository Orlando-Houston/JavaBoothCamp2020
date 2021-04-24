package patterns;

public class BelowTriangle {
    public static void main(String[] args)
    {
        int rowCounter=5,starCount=5;
        for(int i=1;i<=5;i++)   //loop1
        {
            System.out.println();
            for (int j=1;j<=starCount;j++)///loop2
            {
                System.out.print("*");
            }
            starCount--;

        }
}}
