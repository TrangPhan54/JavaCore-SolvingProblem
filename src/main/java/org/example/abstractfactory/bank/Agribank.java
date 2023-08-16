package org.example.abstractfactory.bank;

public class Agribank implements Bank {
    private final String bankName;

    public Agribank(){
        this.bankName ="Agribank";
    }
    @Override
    public String getBankName(){
        return bankName;
    }
}
