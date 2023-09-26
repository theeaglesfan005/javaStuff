import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double inputCount = 0;

        while(1<2) {
            try {
                sum += Integer.parseInt(scanner.nextLine());
                inputCount++;
            } catch (Exception e) {
                break;
            }
        }

        long avg = Math.round(sum/inputCount);

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
