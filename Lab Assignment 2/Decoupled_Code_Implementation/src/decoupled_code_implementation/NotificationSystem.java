/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoupled_code_implementation;

import java.util.List;

public class NotificationSystem {
    private List<Notifier> notifiers;

    // Constructor Injection
    public NotificationSystem(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }

    public void sendNotifications(String message) {
        for (Notifier notifier : notifiers) {
            notifier.send(message);
        }
    }
}

