import java.util.Scanner;

public class SortedArray {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] getIntegers(int arrayLength) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] sortIntegers(int[] array) {
        boolean isSwap = true;

        while(isSwap) {
            isSwap = false;

            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i + 1]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    isSwap = true;
                }
            }
        }
        return array;
    }

}