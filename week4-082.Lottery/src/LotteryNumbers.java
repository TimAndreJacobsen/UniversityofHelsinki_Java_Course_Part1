import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        while (this.numbers.size() < 7){
            int draw = (random.nextInt(39) + 1);
            if (!this.containsNumber(draw)){
                numbers.add(draw);
            }
        }

    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)){ return true; } // number is already in the drawn array
        else {return false;} } // number is unique in the array
}
