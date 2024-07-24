package com.springframework;

public abstract class Money {

    protected int amount;

    // An abstract method is a method without a body that only defines the method signature.
    // These methods must be implemented in child classes.
    public abstract Money times(int multiplier);

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    // The Java equals method only checks the equality of the memory location of two objects
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(object.getClass());
    }

}
