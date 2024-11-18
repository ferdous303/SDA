/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labmid;

import labmid.model.OwnConveince;
import labmid.model.PublicTransport;
import labmid.model.UniversityTSP;

/**
 *
 * @author XPS
 */
public class LabMid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      TransportController controller = new TransportController();
        TransportObserver observer = new TransportObserver();
           controller.addObserver(observer);
        System.out.println("Selecting Public Transport...");
        controller.selectTransport(new PublicTransport());
        controller.applyFilters();

        System.out.println("\nSelecting Own Conveyance...");
        controller.selectTransport(new OwnConveince());
        controller.applyFilters();

        System.out.println("\nSelecting University TSP...");
        controller.selectTransport(new UniversityTSP());
        controller.applyFilters();
        
        
    }
    
}
