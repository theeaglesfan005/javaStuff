public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (((firstNumber < 10) || (firstNumber > 99)) || ((secondNumber < 10) || (secondNumber > 99))) {
            return false;
        } else {
            return (
                    (firstNumber / 10 == secondNumber / 10) ||
                     (firstNumber / 10 == secondNumber % 10) ||
                     (firstNumber % 10 == secondNumber / 10) ||
                     (firstNumber % 10 == secondNumber % 10)
            );
        }
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
