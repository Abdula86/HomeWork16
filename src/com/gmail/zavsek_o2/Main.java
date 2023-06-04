package com.gmail.zavsek_o2;

public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        androidPhone.call("+380671234567");
        androidPhone.sms("+380671234567", "Привет!");
        androidPhone.internet();
        androidPhone.runCommand("ls -l");

        System.out.println();


        iPhones iPhone = new iPhones();
        iPhone.call("+380931234567");
        iPhone.sms("+380931234567", "Как дела?");
        iPhone.internet();
        iPhone.useSiri();
    }
}
