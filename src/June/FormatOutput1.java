package June;

public class FormatOutput1 {
    public static void main(String[] args) {
        String opinion = "Java is Cool";
        System.out.printf("Do you think %s", opinion);
        System.out.println("Do you think" + opinion);
/*

        String stringSample1 = "Hello";
        String stringSample2 = "World";
        System.out.println(stringSample1 + stringSample2);
        System.out.println(stringSample1 + "  " + stringSample2);

 */
        float percentage=78.98f;
        System.out.printf("Yes %.2f of people think is fun",percentage);


    }
}


