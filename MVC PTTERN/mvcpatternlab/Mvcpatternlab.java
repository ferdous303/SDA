/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcpatternlab;
import mvcpatternlab.controller.studentcontroller;
import mvcpatternlab.model.studentsClass;
import mvcpatternlab.presentation.studentclassDetails;

/**
 *
 * @author XPS
 */
public class Mvcpatternlab {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        studentsClass stc = new studentsClass("Ferdous Gulzar",34,3.7);
        studentclassDetails std= new studentclassDetails();
        studentcontroller scontrol = new studentcontroller(stc,std);
        scontrol.updateStudentDetails();
        scontrol.setStudentName("AsiM");
       scontrol.setStudentrollNumber(111);
         scontrol.setStudentCGPA(3.9);
          scontrol.updateStudentDetails();
         
    }
    
}
