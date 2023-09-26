public class LastDigitChecker {

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (isValid(num1) && isValid(num2) && isValid(num3)){
            num1 %= 10;
            num2 %= 10;
            num3 %= 10;

            return (num1 == num2 || num1 == num3 || num2 == num3);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 9, 999));
        System.out.println(hasSameLastDigit (22, 23, 34));
    }
}
