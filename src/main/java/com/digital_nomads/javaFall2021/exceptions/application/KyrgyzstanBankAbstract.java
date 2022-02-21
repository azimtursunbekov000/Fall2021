package com.digital_nomads.javaFall2021.exceptions.application;

public abstract class KyrgyzstanBankAbstract implements InstanBankInterface {
    private String phoneNumber;

    public KyrgyzstanBankAbstract(String phoneNumber) {

        if (phoneNumber.length() != 13|| !phoneNumber.startsWith("+")){
            System.out.println("Invalid phone number");
        }else{
            this.phoneNumber = phoneNumber;
        }

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
