import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // There is only one array in memory. This is two references to the
        // same place in memory
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        // This changes the array in memory that both references point towards
        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {

        array[1] = 2;

    }

}
