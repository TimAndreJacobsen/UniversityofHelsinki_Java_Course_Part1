import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);

        int[] bigArray = new int[2];
        fillArray(bigArray);
        printElegantly(bigArray);

        int[] bigArray2 = new int[2];
        fillArray(bigArray2);
        printElegantly(bigArray2);

        int[] merged = mergeIntArray(bigArray,bigArray2);
        printElegantly(merged);


    }

    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1]);
    }

    public static void fillArray(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100)+1;
        }
    }

    public static int[] mergeIntArray(int[] firstArray, int[] secondArray) {
        int firstArrayLenght = firstArray.length;
        int secondArrayLenght = secondArray.length;
        int length = firstArrayLenght + secondArrayLenght;

        int[] mergedArray = new int[length];

        // add first array to merged array
        for (int i = 0; i < firstArrayLenght; i++) {
            int readBuffer = firstArray[i];
            mergedArray[i] = readBuffer;
        }
        // add second array to merged array
        for (int i = (0+firstArrayLenght); i < secondArrayLenght+firstArrayLenght; i++) {
            int readBuffer = secondArray[i-firstArrayLenght];
            mergedArray[i] = readBuffer;
        }
        return mergedArray;
    }
}
