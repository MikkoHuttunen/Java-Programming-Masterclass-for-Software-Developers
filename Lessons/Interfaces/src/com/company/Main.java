package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone mikkosPhone; //DeskPhone mikkosPhone
        mikkosPhone = new DeskPhone(123456789);
        mikkosPhone.powerOn();
        mikkosPhone.callPhone(123456789);
        mikkosPhone.answer();

        mikkosPhone = new MobilePhone(987654321);
        mikkosPhone.powerOn();
        mikkosPhone.callPhone(987654321);
        mikkosPhone.answer();
    }
}
