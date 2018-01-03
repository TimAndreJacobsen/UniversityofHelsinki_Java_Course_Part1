public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        DecreasingCounter counterTwo = new DecreasingCounter(4);

        counter.printValue();
        counterTwo.printValue();
        counter.decrease();
        counterTwo.decrease();
        counter.printValue();
        counterTwo.printValue();
        counter.decrease();
        counterTwo.decrease();
        counter.printValue();
        counterTwo.printValue();

    }
}
