/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.pattren;

/**
 *
 * @author WALEED TRADERS
 */

import java.io.File;

public class SMSNotificationListener implements EventListener {
    private String phoneNumber;

    public SMSNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("SMS to " + phoneNumber + ": The file " + file.getName() + " was " + eventType + "d.");
    }
}