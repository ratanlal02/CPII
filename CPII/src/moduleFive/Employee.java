/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleFive;

/**
 *
 * @author rlal
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String SSN;
    
    public abstract double estimatedMonthlySalary();
    
    public Employee(){
        firstName = "Unknown";
        lastName = "Unknown";
        SSN = "Unknown";
    }
    
    public Employee(String firstName, String lastName,
            String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    public String getFullName(){
        return lastName + ", "+ firstName;
    }
    
    @Override
    public String toString(){
     return "FirstName:"+firstName+ "\nLastName:"+ lastName+"\nSSN:"+ SSN;
    }
    
    @Override
    public boolean equals(Object obj){
        Employee emp =null;
        if (obj instanceof Employee)
            emp = (Employee) obj;
            if (this.getFullName().equals(emp.getFullName()))
                return true;
        return false;
    
    }
    
}