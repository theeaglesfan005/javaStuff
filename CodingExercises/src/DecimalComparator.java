public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
        return (((int) (firstDouble * 1000)) == ((int) (secondDouble * 1000)));
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}
