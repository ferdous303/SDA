/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpatterndemo;

/**
 *
 * @author WALEED TRADERS
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }
//detaach method for observer
    public void deAttach(Observer observer){
      observers.remove(observer);		
   }
    
   public void notifyAllObservers(){
      for (Observer observer : observers) {
          if(observer.observeState)
          {
         observer.update();
          }
      }
   } 	

    
}
