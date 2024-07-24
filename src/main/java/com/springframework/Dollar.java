package com.springframework;

public class Dollar {

    private int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    // The Java equals method only checks the equality of the memory location of two objects
    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

}
