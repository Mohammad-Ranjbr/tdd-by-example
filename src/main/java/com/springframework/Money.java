package com.springframework;

public class Money {

    protected int amount;

    // The Java equals method only checks the equality of the memory location of two objects
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }

}
