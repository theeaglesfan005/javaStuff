public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");

        int reverseNumber = reverse(number);

        for (int i = 0; i < getDigitCount(number); i++) {
            switch (reverseNumber % 10) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> {
                }
            }
            reverseNumber /= 10;
        }

        System.out.println();
    }

    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }

        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        int digitCount = 1;

        while (number > 9) {
            number /= 10;
            digitCount++;
        }

        return digitCount;
    }

    public static void main(String[] args) {
        numberToWords(123);
    }
}
