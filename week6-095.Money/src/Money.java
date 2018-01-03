
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        return new Money((this.euros + added.euros),(this.cents+added.cents));
    }

    public boolean less(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } else if (this.euros == compared.euros && this.cents >= compared.cents) {
            return false;
        }
        return true;
    }

    public Money minus(Money decreased) {

        if (decreased.less(this)) {

            if (this.euros >= decreased.euros && this.cents >= decreased.cents) {
                System.out.println("hit euroes > euroes && cents > cents");
                return new Money((this.euros - decreased.euros), (this.cents - decreased.cents));

            } else if (this.euros >= decreased.euros && this.cents < decreased.cents) {
                System.out.println("Hit - euros > euros, but cents < cents");
                return new Money((this.euros - decreased.euros - 1), (100 - decreased.cents));
            }
        }
            System.out.println("Its less");
            return new Money(0, 0);
    }

}
