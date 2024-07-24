package com.springframework;

import java.util.Objects;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // An abstract method is a method without a body that only defines the method signature.
    // These methods must be implemented in child classes.

    public String currency(){
        return currency;
    }

    public static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Money franc(int amount){
        return new Franc(amount,"CHF");
    }

    // The Java equals method only checks the equality of the memory location of two objects
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && Objects.equals(this.currency, money.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier,this.currency);
    }

}
