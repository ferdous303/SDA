/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoupled_code_implementation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WALEED TRADERS
 */
public class Decoupled_Code_Implementation
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Notifier emailService = new EmailService();
        Notifier smsService = new SMSService();

        // Add services to a list
        List<Notifier> services = new ArrayList<>();
        services.add(emailService);
        services.add(smsService);

        // Pass services to NotificationSystem
        NotificationSystem system = new NotificationSystem(services);
        system.sendNotifications("Hello, this is a test message!");
    }
    
}
