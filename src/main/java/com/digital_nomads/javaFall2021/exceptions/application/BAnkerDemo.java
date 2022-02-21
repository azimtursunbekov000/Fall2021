package com.digital_nomads.javaFall2021.exceptions.application;
import  static com.digital_nomads.javaFall2021.exceptions.application.Bank.transferFunds;
public class BAnkerDemo {
    public static void main(String[] args) throws Exception {

        DemirBank nursultanDemirBankAccount = new DemirBank(118000000584l,123456789);
        DemirBank urmatDemirBAnkAccount = new DemirBank(118000000000l,987654321);
        System.out.println(nursultanDemirBankAccount.getBalance());
        nursultanDemirBankAccount.deposit(5000);

        System.out.println("After deposit: " + nursultanDemirBankAccount.getBalance());

        transferFunds(nursultanDemirBankAccount,urmatDemirBAnkAccount,2000);
        System.out.println("Urmat balance after transfer is: " + urmatDemirBAnkAccount.getBalance());
        System.out.println("Nursultan balance after transfer is: " + urmatDemirBAnkAccount.getBalance());


        transferFunds(urmatDemirBAnkAccount,nursultanDemirBankAccount,1000);
        System.out.println("Баланс Нурса - " + nursultanDemirBankAccount.getBalance());
        System.out.println("Баланс Урмата - " + urmatDemirBAnkAccount.getBalance());

    }
}
