/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleFive;

/**
 *
 * @author rlal
 */
public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private int hrsWorked;
    
    public HourlyEmployee(String firstName, String lastName, 
            String SSN, double hourlyRate, int hrsWorked){
        super(firstName, lastName, SSN);
        this.hourlyRate = hourlyRate;
        this.hrsWorked = hrsWorked;
    }
    
    public double calculateWeeklySalary(){
        int overHours = 0;
   
        if(hrsWorked > 40){
            overHours = hrsWorked - 40;
        }
        
        return 40 * hourlyRate + (overHours * 0.5*hourlyRate);
        
    }
    
    @Override
    public String toString(){
        //return getFirstName()+ "\n"+ getLastName()+"\n"+
         //       getSSN()+ 
         // or
        return super.toString() + 
                "\n"+ hourlyRate+ "\n"+ hrsWorked;
    }
}
