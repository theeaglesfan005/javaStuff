public class PositiveNegativeZero {

    public static void checkNumber(int number) {
        System.out.println(number == 0 ? "zero" : number > 0 ? "positive" : "negative");
    }

    public static void main(String[] args) {
        checkNumber(-1);
        checkNumber(0);
        checkNumber(1);
    }
}
