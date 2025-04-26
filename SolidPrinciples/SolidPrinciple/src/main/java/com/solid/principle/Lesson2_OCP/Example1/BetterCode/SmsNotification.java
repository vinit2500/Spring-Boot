package com.solid.principle.Lesson2_OCP.Example1.BetterCode;

public class SmsNotification implements  Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}
