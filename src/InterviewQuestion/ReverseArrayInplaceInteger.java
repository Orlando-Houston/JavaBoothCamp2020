package InterviewQuestion;
import java.util.Arrays;
public class ReverseArrayInplaceInteger {
    public static void reverse(int[] array){
        if(array == null || array.length < 2){
            return;
        }
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12,4,45,657,23,442,2};
        System.out.println("Reversed array: " + Arrays.toString(numbers));
        reverse(numbers);
        System.out.println("Reversed array: " + Arrays.toString(numbers));

    }
}
