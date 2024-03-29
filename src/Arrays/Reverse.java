package Arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
        int counter, i=0, j=0, temp;
        int number[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements you want to enter: ");
        counter = scanner.nextInt();

        /* This loop stores all the elements that we enter in an
         * the array number. First element is at number[0], second at
         * number[1] and so on
         */
        for(i=0; i<counter; i++)
        {
            System.out.print("Enter Array Element"+(i+1)+": ");
            number[i] = scanner.nextInt();
        }

        /* Here we are writing the logic to swap first element with
         * last element, second last element with second element and
         * so on. On the first iteration of while loop i is the index
         * of first element and j is the index of last. On the second
         * iteration i is the index of second and j is the index of
         * second last.
         */
        j = i - 1;
        i = 0;
        scanner.close();
        while(i<j)
        {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }

        System.out.print("Reversed array: ");
        for(i=0; i<counter; i++)
        {
            System.out.print(number[i]+ "  ");
        }
    }
}
