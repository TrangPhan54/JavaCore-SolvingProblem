package org.example.abstractfactory.bank;

public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank){
        if(bank==null){
            return null;
        }
        if(bank.equalsIgnoreCase("ACB")){
            return new ACB();
        } else if (bank.equalsIgnoreCase("SHB")) {
            return new SHB();
        } else if (bank.equalsIgnoreCase("Agribank")) {
            return new Agribank();
        }
        return null;
    }
    public Loan getLoan(String loan){
        return null;
    }
}
