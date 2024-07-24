package com.springframework;

public class Franc {

    private int amount;

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    // The Java equals method only checks the equality of the memory location of two objects
    @Override
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

}
