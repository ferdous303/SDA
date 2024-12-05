/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author XPS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
       
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.setData("Hello, MVC!"); 
        controller.updateView();        
    }
}

    
