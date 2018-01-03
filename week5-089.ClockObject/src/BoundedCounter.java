public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public BoundedCounter(int upperLimit, int valueAtStart) {
        this.value = valueAtStart;
        this.upperLimit = upperLimit;
    }

    public void next (){
        if (this.value < this.upperLimit) {
            this.value++;
        } else if (this.value == this.upperLimit){
            this.value = 0;
        } else { //catch block for invalid value
            System.out.println("Value is above limit, how? \n this.value is: " + this.value);
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= this.upperLimit) {
            this.value = newValue;
        } else {
            System.out.println("invalid value passed as parameter.");
        }
    }



}