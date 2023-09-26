public class IntEqualityPrinter {

    public static void printEqual(int a, int b, int c) {
        System.out.println(
                (a < 0 || b < 0 || c < 0) ? "Invalid Value" :
                        ((a == b) && (a == c)) ? "All numbers are equal" :
                                (((a != b) && (a != c)) && (b != c)) ? "All numbers are different" :
                                        "Neither all are equal or different");
    }

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(2, 1, 1);
    }
}

