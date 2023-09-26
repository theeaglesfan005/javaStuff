public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int lastDigit = number;

        while (lastDigit > 0) {
            int currentDigit = lastDigit % 10;
            reverse = (reverse * 10) + currentDigit;
            lastDigit /= 10;
        }

        return number == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // T
        System.out.println(isPalindrome(707)); // T
        System.out.println(isPalindrome(11212)); // F

    }
}
