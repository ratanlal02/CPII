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
        HourlyEmployee hrEmp = new HourlyEmployee("X", "Y", 
                "2344", 30.5, 5);
        System.out.println(hrEmp.getFullName());
        System.out.println(hrEmp.calculateWeeklySalary());
        
        Employee emp1 = new Employee("X", "Y", "123");
        Employee emp2 = new Employee("X", "Y", "123");
        System.out.println(emp1.equals(emp2));
    }
}
