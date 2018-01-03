public class MyDate {
    // Initializations
    private int day;
    private int month;
    private int year;
    // Constructor
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // toString ie, print method. overrides java.lang.object's method
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    // Compares dates and returns bool
    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        return false;
    }
    // Advances time
    public void advance() {
        if (this.day == 30) {
            this.day = 0;

            if (this.month == 12){
                this.month = 0;
                this.year++;
            }
            this.month++;
        }
        this.day++;
    }

    public void advance(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++){ advance(); }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);
        return newMyDate;
    }

}
