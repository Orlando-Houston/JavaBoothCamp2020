package InterviewQuestion;

public class ReverseNumber {
    public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }while(number > 0);
        return reverse;
    }
    public static boolean isPalindrome(int num){
        if(num == reverse(num)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Reverse the number 15697: " + isPalindrome(15697));
        System.out.println("Reverse the number 332696233: " + isPalindrome(332696233));
    }
}
