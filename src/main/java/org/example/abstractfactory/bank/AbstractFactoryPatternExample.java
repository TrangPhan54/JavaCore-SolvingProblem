package org.example.abstractfactory.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the name of the bank");
        String bankName = br.readLine();
        System.out.println("enter the type of loan");
        String loanName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
        Bank bank = bankFactory.getBank(bankName);
        System.out.println("enter the interest rate for "+bank.getBankName());
        double rate = Double.parseDouble(br.readLine());
        System.out.println("enter the loan amount you want to take");
        double loanAmount = Double.parseDouble(br.readLine());
        System.out.println("enter the number of years to pay your entire loan amount");
        int years = Integer.parseInt(br.readLine());
        System.out.println("you are taking the loan from "+ bank.getBankName());
        AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount,years);
    }
}
