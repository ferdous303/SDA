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

    public class OwnConveince  implements TransportMode{

    @Override
    public double calculateCost() {
         return 200;
    }

    @Override
    public String getSchedule() {
         return "Flexible based on user's preference";
    }
    
}


