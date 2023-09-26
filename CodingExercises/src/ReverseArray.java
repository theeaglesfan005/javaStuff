import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        reverse(myArray);
    }

    private static void reverse(int[] array) {
        List<Integer> list = new ArrayList<>(array.length);

        for (int i : array) {
            list.add(i);
        }

        System.out.println("Array = " + list);
        Collections.reverse(list);
        System.out.println("Reversed array = " + list);
    }
}
