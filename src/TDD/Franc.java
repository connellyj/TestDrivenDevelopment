package TDD;


public class Franc extends Money {

    Franc(int amount){
        this.amount = amount;
        currency = "CHF";
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}

