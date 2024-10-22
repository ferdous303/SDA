/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpatterndemo;

/**
 *
 * @author WALEED TRADERS
 */
public abstract class Observer {
    boolean observeState=false;
    
   protected Subject subject;
   public abstract void update();
   public void deAttach(Observer a){
    this.subject.deAttach(a);
       System.out.println("object is deattached");
      
}
 
   public void setUserState(boolean  cond){
    this.observeState=cond;
}
}

