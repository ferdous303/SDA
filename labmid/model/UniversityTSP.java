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

    public class UniversityTSP implements TransportMode {

    @Override
    public double calculateCost() {
         return 1000;
    }

    @Override
    public String getSchedule() {
         return "Fixed: 8:00 AM and 5:00 PM";
    }
    
}


