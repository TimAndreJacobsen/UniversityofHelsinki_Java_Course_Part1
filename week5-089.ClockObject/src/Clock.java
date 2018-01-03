public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.seconds = new BoundedCounter(59);
        this.minutes = new BoundedCounter(59);
        this.hours = new BoundedCounter(23);

        seconds.setValue(secondsAtBeginning);
        minutes.setValue(minutesAtBeginning);
        hours.setValue(hoursAtBeginning);

    }
    
    public void tick() {
        // Clock advances by one second
        if (this.seconds.getValue() == 59) {
            if (this.minutes.getValue() == 59){
                this.hours.next();
            }
            this.minutes.next();
        }
        this.seconds.next();
    }
    
    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
