package decisionStatement;

import java.util.Scanner;

public class WeatherSuggestion {
    public static void main(String[] args) {
        Scanner temp=new Scanner (System.in);
        System.out.println("please enter temperature");
        int degree=temp.nextInt();

        if (degree>30){
            System.out.println("you can wear jaket");
        }
        else{
            System.out.println("hot");
        }
    }
}
