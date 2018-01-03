
public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        //int[] sortMe = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        sort(values);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int smallestSubArray(int[] array, int index) {
        int smallest = array[index];
        int arrayLength = array.length;
        for (int i = index; i < arrayLength; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = smallestSubArray(array, index);
        for (int i = index; i < array.length; i++) {
            if (smallest == array[i]) {
                return i;
            }
        } return -1;
    }

    public static void swap(int[] array, int indexOne, int indexTwo) {
        printArray(array);
        int buffer = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = buffer;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1] + "]");
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minValue = i;

            for (int j = i; j < array.length; j++) {

                if (array[minValue] > array[j]) {
                    minValue = j;
                }
            }
            swap(array, i,minValue);
        }
    }

    public static void sort(int[] array) {
        selectionSort(array);
    }


}
