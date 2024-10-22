/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer.pattren;

/**
 *
 * @author WALEED TRADERS
 */

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("delete", new SMSNotificationListener("+123456789"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
            editor.deleteFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}