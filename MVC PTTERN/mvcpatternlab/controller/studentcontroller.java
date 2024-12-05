/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcpatternlab.controller;
import mvcpatternlab.model.studentsClass;
import mvcpatternlab.presentation.studentclassDetails;
/**
 *
 * @author XPS
 */
public class studentcontroller {
    private studentsClass sc;//refrence variable
    private studentclassDetails sd;

    public studentcontroller(studentsClass sc, studentclassDetails sd) {
        this.sc = sc;
        this.sd = sd;
    }

    public String getname() {
        return sc.getName();
    }
    
    public int getrollNumber() {
      return sc.getRollNumber();
    }
    
    public double getgpa() {
        return sc.getGpa();
    }

    public void setStudentName(String name) {
     sc.setName(name);
    }
    public void setStudentrollNumber(int rollno) {
     sc.setRollNumber(rollno);
    }
    public void setStudentCGPA(double gpa) {
     sc.setGpa(gpa);
    }
  public void updateStudentDetails() {
    sd.printStudentDetails(sc.getName(), sc.getRollNumber(), sc.getGpa());
        
    }

    
}
