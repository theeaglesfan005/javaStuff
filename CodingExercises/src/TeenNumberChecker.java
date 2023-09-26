public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13) && (a <= 19)) || ((b >= 13) && (b <= 19)) || ((c >= 13) && (c <= 19));
    }

    public static boolean isTeen(int a) {
        return ((a >= 13) && (a <= 19));
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(13, 12, 11));
        System.out.println(hasTeen(10, 12, 11));
        System.out.println(isTeen(13));
        System.out.println(isTeen(10));
    }
}
