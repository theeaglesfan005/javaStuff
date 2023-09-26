import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    private static int readInteger () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of numbers to enter: ");
        int counter = scanner.nextInt();
        scanner.nextLine();
        return counter;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[count];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            scanner.nextLine();
            intArray[i] += num;
        }
        return intArray;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
