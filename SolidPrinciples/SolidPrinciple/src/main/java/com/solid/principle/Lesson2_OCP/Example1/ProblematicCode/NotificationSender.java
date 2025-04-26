package com.solid.principle.Lesson2_OCP.Example1.ProblematicCode;

import java.util.List;

/*
  First problem is this class know too much about Notificationtypes.
  Second we we want to add new notification let's say Push Notification then we will have to write
  one another condition here  (else if) otherwise code will not support push notification.

  so the problem is that without modifying the NotificationSender we are not able to add new feature here
  for new feature modifying NotificationType is okay but modifying NotificationSender is not.
  this voilating the OCP.

  OCP => A class should be open for extension but closed for modification(sometimes we have to modified but here).
 */

public class NotificationSender {

    /*
       Should be independent from new feature closed for modification in simple words
     */
    public void sendNotification(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSMSNotification();
            }
            else if(type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            }
            else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            }
        }
    }
}
