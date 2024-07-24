package com.springframework;

public class Sum implements Expression{

    public Money augment;
    public Money addend;

    public Sum(Money augment, Money addend){
        this.augment = augment;
        this.addend = addend;
    }

    public Money reduce(String to){
        int amount = augment.amount + addend.amount;
        return new Money(amount,to);
    }

}
