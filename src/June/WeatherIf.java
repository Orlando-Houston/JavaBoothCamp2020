package June;

import java.util.Scanner;

public class WeatherIf {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter temperature :");
    int degree = scanner.nextInt();
    if (degree <= 30) {
        System.out.print("Wear Hat");

    } else {
        System.out.println("Wear Hat");

    }
}
}
