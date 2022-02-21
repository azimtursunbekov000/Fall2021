package com.digital_nomads.javaFall2021.exceptions.application;
import static com.digital_nomads.javaFall2021.exceptions.application.InstanBankInterface.transferWithMbank;

public class KyrgyzBankDemo {
    public static void main(String[] args) throws Exception {

        KyrgyzstanBank azimKyrgyzAccount = new KyrgyzstanBank("+996705283128");
        KyrgyzstanBank saidaKyrgyzAccount = new KyrgyzstanBank("+996505659789");
        azimKyrgyzAccount.deposit(100000);
        transferWithMbank(azimKyrgyzAccount,saidaKyrgyzAccount,10000);
        System.out.println("Azim balance: " + azimKyrgyzAccount.getBalance());
        System.out.println("Saida balance: " + saidaKyrgyzAccount.getBalance());
        System.out.println("Azim phone " + azimKyrgyzAccount.getPhoneNumber());
        System.out.println("Saida phone " + saidaKyrgyzAccount.getPhoneNumber());


    }
}
