package com.solid.principle.Lesson2_OCP.Example1.BetterCode;

import com.solid.principle.Lesson2_OCP.Example1.ProblematicCode.NotificationType;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<Notification> notifications) {
        for(Notification notification: notifications) {
             notification.send();
        }
    }
}