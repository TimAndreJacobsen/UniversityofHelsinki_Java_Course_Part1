public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i=0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        if (amount>0) {
            for (int i = 0; i < amount; i++) {
                System.out.print(" ");
            }
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        for (int i = 1; i<=size; i++){
            printWhitespaces(size-i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i;
        for (i = 1; i <= height; i++) {
            printWhitespaces(height-i);
            printStars(i + (i-1));
            //printStars(i-1);
            //printLinebreak();
        }
        for (int j=0; j<2; j++) { //do it twice
            printWhitespaces(i-3);
            printStars(3);
            //printLinebreak();
        }
    }

    public static void printLinebreak() {
        System.out.println();
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        //printTriangle(5);
        //System.out.println("---");
        xmasTree(4);
        //System.out.println("---");
        xmasTree(10);
    }
}
