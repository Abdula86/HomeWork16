package com.gmail.zavsek_o2;

public class iPhones extends Smartphones implements iOS {
   @Override
    public void call(String phoneNumber) {
        System.out.println("Звонок на " + phoneNumber + "с iOS устройства.");
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Отправка SMS на " + phoneNumber + "с iOS устройства.");
        System.out.println("Сообщение " + message);
    }

    @Override
    public void internet() {
        System.out.println("Работа в интернете на iOS устройстве.");
    }

    @Override
    public void useSiri() {
        System.out.println("Использование Siri на Iphone.");
    }
}

