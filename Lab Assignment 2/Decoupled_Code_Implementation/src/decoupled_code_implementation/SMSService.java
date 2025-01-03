/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package decoupled_code_implementation;

public class SMSService implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("SMS Sent: " + message);
    }
}

