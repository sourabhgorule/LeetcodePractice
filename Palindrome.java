public class Palindrome {
    public static void main(String[] args) {
        String temp = "1221";

        isPalindrome(1234);

        int left = 0;
        int right = temp.length() - 1;
        while (left < right) {
            if (temp.charAt(left) != temp.charAt(right)) {
                System.out.println("string is not palindrome!");
                break;
            }
            left++;
            right--;
        }
        System.out.println("String is palindrome !!!");
    }

    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;

    }
}
