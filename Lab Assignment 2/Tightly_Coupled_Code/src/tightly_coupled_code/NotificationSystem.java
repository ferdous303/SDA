/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tightly_coupled_code;

/**
 *
 * @author WALEED TRADERS
 */
public class NotificationSystem {
    private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();

    public void sendNotifications(String message) {
        emailService.sendEmail(message);
        smsService.sendSMS(message);
    }
}

class EmailService {
    public void sendEmail(String message) {
        System.out.println("Email Sent: " + message);
    }
}

class SMSService {
    public void sendSMS(String message) {
        System.out.println("SMS Sent: " + message);
    }
}

