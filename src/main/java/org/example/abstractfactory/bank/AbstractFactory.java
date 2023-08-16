package org.example.abstractfactory.bank;

public abstract class AbstractFactory {
    abstract Bank getBank(String bank);
    abstract Loan getLoan(String loan);
}
