package org.example.abstractfactory.bank;

public class ACB implements Bank {
    private final String bankName;

    public ACB(){
        this.bankName="ACB";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
