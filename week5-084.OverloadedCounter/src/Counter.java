public class Counter {
    int value;
    boolean check;

    // Constructors
    public Counter(int startingValue, boolean check) {
    this.value = startingValue;
    this.check = check;
    }
    public Counter(int startingValue) {
        this.value = startingValue;
        this.check = false;
    }
    public Counter(boolean check) {
        this.value = 0;
        this.check = check;
    }
    public Counter() {
        this.value = 0;
        this.check = false;
    }

    // Getter for value
    public int value() {
        return value;
    }

    // increments value
    public void increase() {
        this.value++;
    }

    public void increase(int increaseAmount) {
        for (int i = 0; i < increaseAmount; i++) {
            increase();
        }
    }

    // decrease by one
    public void decrease() {
        System.out.println("pre: " + this.value);
        if (check==true) {
            if (this.value < 1) {
                this.value = 0;
            } else {
                this.value--;
            }
        } else {
            this.value--;
        }
        System.out.println("post: " + this.value);
    }
    public void decrease(int decreaseAmount) {
        for (int i = 0; i < decreaseAmount; i++) {
            decrease();
        }
    }
}
