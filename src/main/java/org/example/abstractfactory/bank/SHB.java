package org.example.abstractfactory.bank;

public class SHB implements Bank {
    private final String bankName;
    public SHB() {
        this.bankName = "SHB";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
