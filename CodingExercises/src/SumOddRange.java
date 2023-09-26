public class SumOddRange {

    public static boolean isOdd(int number) {
        return number >= 0 && (number % 2 != 0);
    }
    public static int sumOdd(int start, int end) {
        int oddSum = 0;

        if ((end < start) || (start <=0) || (end <=0)) {
            oddSum = -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    oddSum += i;
                }
            }
        }

        return oddSum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
}