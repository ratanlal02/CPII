/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleFour;

/**
 *
 * @author RLAL
 */
public class Student {
    // Attributes
    private String name;
    private double gpa;
    private String major;
    // No-argument constructor
    public Student(){
        name = "Unknown";
        gpa = 0.0;
        major = "Unknown";
    }
    // Parameterized constructor
    public Student(String name, double gpaIn, String majorIn){
        this.name = name;
        gpa = gpaIn;
        major = majorIn;
    }
    public Student(String nameIn){
        name = nameIn;
    }
    public Student(double gpaIn){
        gpa = gpaIn;
    }
    // Accessor or Getter methods
    public String getName(){
        return name;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public String getMajor(){
        return major;
    }
    
    // Mutator or setter method
    public void setName(String name){
        this.name = name;
    }
    
    public void setGpa(double gpaIn){
        gpa = gpaIn;
    }
    
    public void setMajor(String majorIn){
        major = majorIn;
    }
    
    @Override
    public String toString(){
        return name + " "+ gpa+" "+ major;
    }
}
