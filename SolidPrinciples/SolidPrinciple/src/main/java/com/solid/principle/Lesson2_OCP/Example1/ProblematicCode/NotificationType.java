package com.solid.principle.Lesson2_OCP.Example1.ProblematicCode;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP;

    public void sendSMSNotification() {
        System.out.println("Sending Notification");
    }

    public void sendEmailNotification() {
        System.out.println("Sending Email");
    }


    public void sendWhatsappNotification() {
        System.out.println("Sending Whatsapp");
    }
}
