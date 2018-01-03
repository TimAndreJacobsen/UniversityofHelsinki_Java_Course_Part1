import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print all
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int length = array.length;
        int[] copied = new int[length];

        for (int i = 0; i < length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int length = array.length;
        int[] copied = new int[length];

        for (int i = 0; i < length; i++) {
            copied[(length-1)-i] = array[i];
        }
        return copied;
    }


}
