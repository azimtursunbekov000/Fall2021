package com.digital_nomads.javaFall2021.exceptions.application;

public interface InstanBankInterface {
    double getBalance();
    void deposit(double amount) throws Exception;
    void withDraw(double amount) throws Exception;

    static  void transferWithMbank(InstanBankInterface sender,InstanBankInterface recipient,double transferAmount) throws Exception {
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }
}
