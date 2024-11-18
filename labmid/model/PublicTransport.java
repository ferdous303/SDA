/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid.model;

import labmid.TransportMode;

/**
 *
 * @author XPS
 */

   public class PublicTransport implements TransportMode {

    @Override
    public double calculateCost() {
         return 50; 
    }

    @Override
    public String getSchedule() {
        return "Every 15 minutes";
    }
    
}
 

