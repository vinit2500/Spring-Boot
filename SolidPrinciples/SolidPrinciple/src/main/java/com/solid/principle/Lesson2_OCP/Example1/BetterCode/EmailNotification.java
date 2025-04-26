package com.solid.principle.Lesson2_OCP.Example1.BetterCode;

public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}
