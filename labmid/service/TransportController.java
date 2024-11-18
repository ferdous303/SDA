/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid.service;

import java.util.ArrayList;
import java.util.List;
import labmid.Observer;
import labmid.TransportMode;

/**
 *
 * @author XPS
 */

    import java.util.ArrayList;
import java.util.List;
public class TransportController {
    public TransportMode currentMode;
    public List<Observer> observers = new ArrayList<>();

    public void selectTransport(TransportMode mode) {
        this.currentMode = mode;
        notifyObservers();
    }

    public void applyFilters() {
        System.out.println("Applying filter for: " + currentMode.getClass().getSimpleName());
        System.out.println("Cost: " + currentMode.calculateCost());
        System.out.println("Schedule: " + currentMode.getSchedule());
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
      
}}


