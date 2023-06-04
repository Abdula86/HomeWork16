package com.gmail.zavsek_o2;

public class Androids extends Smartphones implements LinuxOS {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Звонок на " + phoneNumber + "с Android устройства.");
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Отправка SMS на " + phoneNumber + "с Android устройства.");
        System.out.println("Сообщение " + message);
    }

    @Override
    public void internet() {
        System.out.println("Работа в интернете на Android устройстве.");
    }

    @Override
    public void runCommand (String command) {
        System.out.println("Выполнение команды: " + command + "на Android устройстве на базе Linux.");
    }
}

