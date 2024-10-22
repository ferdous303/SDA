/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer.pattren;

/**
 *
 * @author WALEED TRADERS
 */
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
