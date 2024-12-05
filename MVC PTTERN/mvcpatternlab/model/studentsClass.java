/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcpatternlab.model;

/**
 *
 * @author XPS
 */
public class studentsClass {
    private String name;
    private int rollNumber;
    private double gpa;

    public studentsClass(String name, int rollNumber, double gpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getGpa() {
        return gpa;
    }
    
}
