/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleFive;

/**
 *
 * @author rlal
 */
public class Main {
    public static void main(String[] args){
        /*
        HourlyEmployee hrEmp = new HourlyEmployee("X", "Y", 
                "2344", 30.5, 5);
        System.out.println(hrEmp.getFullName());
        System.out.println(hrEmp.calculateWeeklySalary());
        
        Employee emp1 = new Employee("X", "Y", "123");
        Employee emp2 = new Employee("X", "Y", "123");
        System.out.println(emp1.equals(emp2));
        */
        /*
        Employee emp = new HourlyEmployee("X", "Y", 
                "2344", 30.5, 5);
        System.out.println((emp instanceof Employee));
        System.out.println((emp instanceof Object));
        emp = new Employee("X", "Y","2344");
        System.out.println((emp instanceof Employee));
        System.out.println((emp instanceof Object));
        System.out.println((emp instanceof HourlyEmployee));
        */
        System.out.println("What is estimated monthly salary of Hourly Employee");
        String empType = "Hourly";
        Employee emp = null;
        switch(empType){
            case "Hourly":
                emp = new HourlyEmployee("X", "Y", 
                "2344", 30.5, 5);
                break;
            case "Faculty":
                emp = null;       
        }
        
        System.out.println(emp.estimatedMonthlySalary());
        System.out.println(emp.getOrgName());
        
        Organization objOrg = emp;
        System.out.println(objOrg.getFullName());
        
        
    }
}
